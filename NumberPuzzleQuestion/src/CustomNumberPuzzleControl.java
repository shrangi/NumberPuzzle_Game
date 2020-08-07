import java.awt.*;

class CustomNumberPuzzleControl extends NumberPuzzleControl {
	public int getWidth() {
		return 200;
	}
	public int getHeight() {
		return 250;
	}
	public int getXPosition() {
		return 200;
	}
	public int getYPosition() {
		return 200;
	}
	public String getTitle(){
		return "Number Puzzle";
	}
	public int getShuffleButtonFontSize() {
		return 12;
	}
	public int getNumbersFontSize() {
		return 12;
	}
	public Color getEmptyButtonColor() {
		return Color.WHITE;
	}
	public String getWinnerMessage() {
		return "Congrats, you have won!";
	}

	// The following three methods have to be written by the participants...

	public int handleButtonClicked(NumberPuzzleGame game){
		int emptyCellId = game.getEmptyCellId();
		Button buttonClicked = game.getButtonClicked();
		Button[] buttons = game.getButtons();
		
		//Your logic here		
		for(int i=0; i<buttons.length; i++) {
			String btnId = buttons[i].getLabel();
		}
		swapButton( buttons[emptyCellId], buttonClicked);
		
		return emptyCellId;

	}
	public int[] getRandomNumbersForGrid() {
		int arr[] = new int[15];
		
		//Your logic here
//		int hash[]= new int[15];
//		int res[] = new int[15];
//		int count=0;
//		while(count<=15) {
//			int a = getRandomNumber();
//			int r= (a%16);
//			if(r!=0 && hash[r]==0) {
//				res[count]=r;
//				hash[r]++;
//				count++;
//			}
//		
//		}
//		for(int i=0;i<15; i++) {
//			arr[i] = res[i];
//		}
//		
		int[] test= {1,2,3,6,4,5,9,8,7,15,14,13,11,12,10};
		return test;
	}
	public boolean checkForWinner(Button[] buttons)
	{
		boolean winner = true;
		
		// Your Logic here
		int result[] = getIntegerArrayOfButtonIds(buttons);
		for(int i=0;i<result.length;i++)
		{
			if(i+1 != result[i]) {
				winner= false;
				break;
			}
		}

		return winner;
	}
}