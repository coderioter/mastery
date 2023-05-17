package com.coderioter.contests.leetcode;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {
	static class Reader {
		final private int BUFFER_SIZE = 1 << 16;
		private DataInputStream din;
		private byte[] buffer;
		private int bufferPointer, bytesRead;

		public Reader()
		{
			din = new DataInputStream(System.in);
			buffer = new byte[BUFFER_SIZE];
			bufferPointer = bytesRead = 0;
		}

		public Reader(String file_name) throws IOException
		{
			din = new DataInputStream(
				new FileInputStream(file_name));
			buffer = new byte[BUFFER_SIZE];
			bufferPointer = bytesRead = 0;
		}

		public String readLine() throws IOException
		{
			byte[] buf = new byte[64]; // line length
			int cnt = 0, c;
			while ((c = read()) != -1) {
				if (c == '\n') {
					if (cnt != 0) {
						break;
					}
					else {
						continue;
					}
				}
				buf[cnt++] = (byte)c;
			}
			return new String(buf, 0, cnt);
		}

		public int nextInt() throws IOException
		{
			int ret = 0;
			byte c = read();
			while (c <= ' ') {
				c = read();
			}
			boolean neg = (c == '-');
			if (neg)
				c = read();
			do {
				ret = ret * 10 + c - '0';
			} while ((c = read()) >= '0' && c <= '9');

			if (neg)
				return -ret;
			return ret;
		}

		public long nextLong() throws IOException
		{
			long ret = 0;
			byte c = read();
			while (c <= ' ')
				c = read();
			boolean neg = (c == '-');
			if (neg)
				c = read();
			do {
				ret = ret * 10 + c - '0';
			} while ((c = read()) >= '0' && c <= '9');
			if (neg)
				return -ret;
			return ret;
		}

		public double nextDouble() throws IOException
		{
			double ret = 0, div = 1;
			byte c = read();
			while (c <= ' ')
				c = read();
			boolean neg = (c == '-');
			if (neg)
				c = read();
			
			while (c >= '0' && c <= '9') {
				ret = ret * 10 + c - '0';
				c = read();
			} 

			if (c == '.') {
				while ((c = read()) >= '0' && c <= '9') {
					ret += (c - '0') / (div *= 10);
				}
			}

			if (neg)
				return -ret;
			return ret;
		}
		
		public double nextFloat() throws IOException
		{
			float ret = 0, div = 1;
			byte c = read();
			while (c <= ' ')
				c = read();
			boolean neg = (c == '-');
			if (neg)
				c = read();
			
			while (c >= '0' && c <= '9') {
				ret = ret * 10 + c - '0';
				c = read();
			} 
			
			if (c == '.') {
				while ((c = read()) >= '0' && c <= '9') {
					ret += (c - '0') / (div *= 10);
				}
			}
			
			if (neg)
				return -ret;
			return ret;
		}

		private void fillBuffer() throws IOException
		{
			bytesRead = din.read(buffer, bufferPointer = 0,
								BUFFER_SIZE);
			if (bytesRead == -1)
				buffer[0] = -1;
		}

		private byte read() throws IOException
		{
			if (bufferPointer == bytesRead)
				fillBuffer();
			return buffer[bufferPointer++];
		}

		public void close() throws IOException
		{
			if (din == null)
				return;
			din.close();
		}
	}

	public static void main(String[] args)
		throws IOException
	{
		Reader s = new Reader();
		LongestSubstringWithoutRepeatingCharacters l = new LongestSubstringWithoutRepeatingCharacters();
		while (true) {
			String string = s.readLine().replaceAll("\n","").replaceAll("\r", "");
			
			if (string.length() == 0 ) {
				return;
			}
			System.out.println(string+" "+l.lengthOfLongestSubstring(string));
		}
	}
	
    public int lengthOfLongestSubstring(String s) {
        if(s.length()<2){
            return s.length()==0?0:1;
        }
        Set<Character> set = new HashSet<>();
        int i=0,j=0;
        int ml=-1;
        while(j<=s.length()){
            int d=j-i;
            if(d==set.size()){
                ml=Math.max(j-i,ml);
                if(j<s.length()){
                     set.add(s.charAt(j++));
                }else {
                	return ml;
                }
            }else if(d>set.size()){
                set.clear();
                set.add(s.charAt(j-1));
                	i=j-1;
            }else {
                set.add(s.charAt(j));
                ++j;
                }
        }
        return ml;
    }
}
/*
 *Add items to set while set size == j-i
 *if set size>j-i remove items from set at i, advance i
 *else if set size<j-i advance j 
 ****Rework the logic
 *Problem seems to be in remove items from set.
 * Failed on one input
 * abcabcbb
bbbbb
pwwkew
ab
abcdefghijklmnopqrstuvwxyz
dvdf - Failed

 * */
