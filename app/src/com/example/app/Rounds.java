package com.example.app;


public class Rounds {
	private static int TOTALNUM;

	
	Rounds(int people){
		TOTALNUM = people;
	}
	
	private boolean even(int num){
		if(num%2 == 0){
			return true;
		}
			return false;
	}
	
	public int [] roundone(){
		if(even(TOTALNUM) == true){
			int [] round2 = {TOTALNUM/2,TOTALNUM/2};
			return round2;
		}
		else{
			int [] round2 = {(TOTALNUM/2)+1,TOTALNUM/2};
			return round2;
		}
	}
	
	public int [] roundtwo(int [] num){
		if(even(num[0]) == true && even(num[1]) == true){
			int [] round3 = {num[0]/2, num[0], num[0]/2};
			return round3;
		}
		else if(even(num[0]) == false && even(num[1]) == true){
			int [] round3 = {(num[0]/2)+1,num[1], num[1]/2};
			return round3;
		}
		else if(even(num[0]) == true && even(num[1]) == false){
			int [] round3 = {num[0]/2, num[0], num[1]/2};
			return round3;
		}
			int [] round3 = {(num[0]/2)+1, num[0]-1, (num[0]/2)+1};
			return round3;
	}

	public int [] roundthree(int [] num){
		if(even(num[0]) == true && even(num[1]) == true && even(num[2]) == true){
			int [] round4 = {num[0]/2, num[1]/2 + num[0]/2, num[1]/2 + num[0]/2, num[0]/2};
			return round4;
		}
		else if(even(num[0]) == false && even(num[1]) == true && even(num[2]) == false){
			int [] round4 = {(num[0]/2)+1, num[0]/2 + num[1]/2, num[0]/2 + num[1]/2, (num[0]/2)+1};
			return round4;
		}
		else if(even(num[0]) == false && even(num[1]) == true && even(num[2]) == true){
			int [] round4 = {(num[0]/2)+1, (TOTALNUM - (((num[0]/2)+1) + (num[2]/2)))/2, 
					(TOTALNUM - (((num[0]/2)+1) + (num[2]/2)))/2, num[2]/2};
			return round4;
		}
		else if(even(num[0]) == true && even(num[1]) == true && even(num[2]) == false){
			int [] round4 = {num[0]/2, num[0]/2 + num[1]/2, num[0]/2 + num[1]/2, num[2]/2};
			return round4;
		}
		return null;
	   
	}
	
	public int [] roundfour(int [] num){ 
		if(even(num[0]) == true && even(num[1]) == true && 
		   even(num[2]) == true && even(num[3]) == true){
			int [] round5 = {num[0]/2, num[0]/2 + num[1]/2, num[1]/2 +
					num[2]/2, num[2]/2 + num[3]/2, num[3]/2};
			return round5;
		}
		else if(even(num[0]) == true && even(num[1]) == false && 
			even(num[2]) == false && even(num[3]) == false){
			int [] round5 = {num[0]/2, num[0]*2, num[1]-1, num[0]*2, num[3]/2};
			return round5;
		}
		else if(even(num[0]) == true && even(num[1]) == false && 
				even(num[2]) == false && even(num[3]) == true){
				int [] round5 = {num[0]/2, (num[1]/2)+1, num[1]-1, (num[1]/2)+1, num[3]/2};
				return round5;
		}
		else if(even(num[0]) == true && even(num[1]) == true && 
				even(num[2]) == true && even(num[3]) == false){
				int [] round5 = {num[0]/2, num[0]*2 - 1 , num[1], num[0]*2 - 1, num[3]/2};
				return round5;
		}
		else if(even(num[0]) == false && even(num[1]) == true && 
				even(num[2]) == true && even(num[3]) == true){
				int [] round5 = {num[0]/2 + 1, num[3]*2, num[1], num[3]*2, num[3]/2};
				return round5;
			}
		else if(even(num[0]) == false && even(num[1]) == true && 
				even(num[2]) == true && even(num[3]) == false){
				int [] round5 = {num[0]/2 + 1, (num[0])/2 + num[1]/2, num[1], num[0]/2 + num[1]/2, num[3]/2 + 1};
				return round5;
			}
		else if(even(num[0]) == false && even(num[1]) == false && 
				even(num[2]) == false && even(num[3]) == true){
				int [] round5 = {num[0]/2 + 1, num[0]/2 + num[1]/2, num[1]+1, num[0]/2 + num[1]/2, num[3]/2};
				return round5;
			}
		else if(even(num[0]) == false && even(num[1]) == false && 
				even(num[2]) == false && even(num[3]) == false){
				int [] round5 = {num[0]/2 + 1, num[0]*2 - 2, num[1] + 1, num[0]*2 - 2, num[3]/2 + 1};
				return round5;
			}
		return null;
	}

	public int [] roundfive(int [] num){
		if(even(num[0]) == true && even(num[1]) == true && 
		   even(num[2]) == true && even(num[3]) == true &&
		   even(num[4]) == true){
					int [] outrounds = {num[0]/2, num[0]/2 + num[1]/2, num[1]/2 +
										num[2]/2, num[2]/2 + num[3]/2, num[3]/2 + 
										num[4]/2, num[4]/2};
					return outrounds;
				}
		else if(even(num[0]) == true && even(num[1]) == false && 
				even(num[2]) == true && even(num[3]) == false &&
				even(num[4]) == true){
					int [] outrounds = {num[0]/2, num[0]/2 + (num[1]/2 + 1), num[2],
										num[2]/2 + num[3]/2, num[3]/2 + 
										num[4]/2, num[4]/2};
					return outrounds;
				}
		else if(even(num[0]) == true && even(num[1]) == true && 
				even(num[2]) == true && even(num[3]) == true &&
				even(num[4]) == false){
					int [] outrounds = {num[0]/2, num[0]/2 + num[1]/2, num[1]/2 + num[2]/2,
										num[2]/2 + num[3]/2, num[3]/2 + 
										num[4]/2 + 1, num[4]/2};
					return outrounds;
				}
		else if(even(num[0]) == false && even(num[1]) == false && 
				even(num[2]) == true && even(num[3]) == false &&
				even(num[4]) == true){
					int [] outrounds = {num[0]/2 + 1, num[0]/2 + num[1]/2, num[1]/2 + num[2]/2 + 1,
										num[2]/2 + num[3]/2 + 1, num[0]/2 + num[1]/2, num[4]/2};
					return outrounds;
				}
		
		return null;
	}
}
