/*
 * Given a list of numbers that may has duplicate numbers, 
 * return all possible subsets

 Notice

Each element in a subset must be in non-descending order.
The ordering between two subsets is free.
The solution set must not contain duplicate subsets.
Example
If S = [1,2,2], a solution is:

[
  [2],
  [1],
  [1,2,2],
  [2,2],
  [1,2],
  []
]

Challenge
Can you do it in both recursively and iteratively?
 */
public class SubsetsII {

    /**
     * @param S: A set of numbers.
     * @return: A list of lists. All valid subsets.
     */
    public ArrayList<ArrayList<Integer>> subsetsWithDup(ArrayList<Integer> S) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        Collections.sort(S);
    } 

    public void dfs(ArrayList<ArrayList<Integer>> result, 
            ArrayList<Integer> list, int position, ArrayList<Integer> S) {

    }

}
