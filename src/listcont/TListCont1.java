package listcont;

public class TListCont1 {
	       private int m;
	       private int ultimo;
	       private float[] x;

	        
	        
	    public TListCont1(int m){
		    this.m = m;
	    	ultimo = -1;
		    x = new float[m];
	    }
	    public float consulta(int k) throws  IndexOutOfBoundsException{
	    	if(k >= 0 && k <= ultimo)
		        return  x[k];
		    else
		    {
		        throw new IndexOutOfBoundsException("Indice invalido!");
		    }
	    }
	    public void atribui(int k, float val){
		    if(k >= 0 && k <= ultimo)
		        x[k] = val;
		    else
		    {
		        System.out.println("Indice invalido!");
		    }
	    }
	    public void insereK(int k, float val){
		    if(ultimo == m-1)
		    {
		        System.out.println("Vetor cheio!");
		    }

		    if(k >= 0 && k <= ultimo)
		    {
		        for(int i = ultimo; i >= k; i--)
		            x[i+1] = x[i];
		        x[k] = val;
		        ultimo = ultimo + 1;
		    }
		    else
		    {
		        System.out.println("Indice invalido!");
		    }
	    }
	    public void insereUlt(float val){
	        	if(ultimo == m-1)
	    	    {
	    	        System.out.println("Vetor cheio!");
	    	    }
	    	    ultimo = ultimo + 1;
	    	    x[ultimo] = val;
	        }
	    public void eliminaK(int k){
	    	    if(k >= 0 && k <= ultimo)
	    	    {
	    	        for(int i = k; i <= ultimo-1; i++)
	    	            x[i] = x[i+1];
	    	        ultimo = ultimo - 1;
	    	    }
	    	    else
	    	    {
	    	        System.out.println("Indice invalido!");
	    	    }
	        }
	    public void eliminaUlt(){
	    	    if(ultimo == -1)
	    	    {
	    	        System.out.println("Lista vazia!");
	    	    }
	    	    ultimo = ultimo - 1;
	        }
	    public void imprime(){
	    	    int i;
	    	    for (i=0; i<=ultimo; i++)
	    	        System.out.println(x[i] + "  ");
	        }
}
