package com.practice.leetcode;

import java.util.*;

public class RemoveSubfolders {
    public List<String> removeSubfolders(String[] folder) {
        Arrays.sort(folder);  // Lexicographically sorts, so "/a" comes before "/a/b"
        System.out.println(Arrays.toString(folder));
        List<String> result = new ArrayList<>();
        String prev = "";

        for (String f : folder) {
            // Check if the previous folder is a parent of current
            if (prev.isEmpty() || !f.startsWith(prev + "/")) {
                result.add(f);
                prev = f;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        RemoveSubfolders obj = new RemoveSubfolders();
        String[] folder = {"/a","/a/b","/c/d/e","/c/f","/c/d"};
        System.out.println(obj.removeSubfolders(folder));
    }
}
