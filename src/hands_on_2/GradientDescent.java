package hands_on_2;

public class GradientDescent {
	private static final double TOLERANCE = 1E-11;
	//Betha_0 and Betha_1
	private double betha_0;
    private double betha_1;
    
    public double getBetha_0() {
        return betha_0;
    }
    
    public double getBetha_1() {
        return betha_1;
    }
    
    public GradientDescent(double betha_0, double betha_1) {
         this.betha_0 = betha_0;
         this.betha_1 = betha_1;
    }

    public double getHypothesisResult(double x){
        return betha_0 + betha_1 * x;
    }
    
    private double getResult(double[][] trainingData, boolean enableFactor){
        double result = 0;
        for (int i = 0; i < trainingData.length; i++) {
            result = (getHypothesisResult(trainingData[i][0]) - trainingData[i][1]);
            if (enableFactor) result = result*trainingData[i][0]; 
        }
        return result;
    }
    
    public void train(double learningRate, double[][] trainingData){
        int iteration = 0;
        do{
            iteration++;
            double temp0 = betha_0 - learningRate*(((double) 1/trainingData.length)*getResult(trainingData, false));
            double temp1 = betha_1 - learningRate*(((double) 1/trainingData.length)*getResult(trainingData, true));
            betha_0 = temp0; betha_1 = temp1;
        }while(iteration < 100000);
    }

}
