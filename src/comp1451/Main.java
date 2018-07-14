
package comp1451;

import java.util.ArrayList;

/**
 *
 * @author wangmengjun
 */
public class Main {
    
    public static ArrayList<Integer> visited = new ArrayList<>();
    
    public static int [][] graph = {{},
                                    {8,5},
                                    {5,7,8},
                                    {2,4,7,9},
                                    {3,6},
                                    {1,2,6,7,8},
                                    {4,5},
                                    {2,3,5,9},
                                    {1,2,5},
                                    {3,7}};
    
    public static void def(int v){
        visit(v);
        
        for(int i = 0; i < graph[v].length; i++){
            if (!visited.contains((Integer)graph[v][i])) {
                System.out.print(graph[v][i] + " ");
                def(graph[v][i]);
                System.out.print(v+ " ");
            }
        }  
    }
    
    public static void visit(int v){
        visited.add(v);
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        def(4);
        System.out.println("");
    }
    
    
}
