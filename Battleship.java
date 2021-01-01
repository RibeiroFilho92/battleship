import java.io.IOException;
import java.util.Scanner;

public class Battleship {

	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		boolean noWinner = true;
		boolean turnP1 = true;
		boolean turnP2 = false;
		// INIT P1
		int piecesOne = 0;
		String[][] initialBoardOne = new String[10][];
		String[][] boardFogOne = new String[10][];
		String[] aircraftCarrierOne = {" ", " ", " ", " ", " ", "P1", "P2", "P3", "P4", "P5"};
		String[] battleshipOne = {" ", " ", " ", " ", "P1", "P2", "P3", "P4"};
		String[] submarineOne = {" ", " ", " ", "P1", "P2", "P3"};
		String[] cruiserOne = {" ", " "," ", "P1", "P2", "P3"};
		String[] destroyerOne = {" ", " ", "P1", "P2"};
		String initOne;
		String endOne;
		initialBoard(initialBoardOne);
		initialBoard(boardFogOne);
		printBoard(initialBoardOne);
		System.out.println("Player 1, place your ships on the game field");
		System.out.println();
		while (piecesOne != 5) {
			if (piecesOne == 0) {
				System.out.println("Enter the coordinates of the Aircraft Carrier (5 cells):");
				System.out.println();
				initOne = sc.next().toUpperCase();
				endOne = sc.next().toUpperCase();	
				if (pieces(initialBoardOne, "Aircraft Carrier", initOne, endOne)) {
					piecesOne++;
					printBoard(initialBoardOne);
					fillArray(initialBoardOne, aircraftCarrierOne, "Aircraft Carrier", initOne, endOne);
				}
				System.out.println();
			}
			if (piecesOne == 1) {
				System.out.println("Enter the coordinates of the Battleship (4 cells):");
				System.out.println();
				initOne = sc.next().toUpperCase();
				endOne = sc.next().toUpperCase();	
				if (pieces(initialBoardOne, "Battleship", initOne, endOne)) {
					piecesOne++;
					printBoard(initialBoardOne);
					fillArray(initialBoardOne, battleshipOne, "Battleship", initOne, endOne);
				}
				System.out.println();
			}
			if (piecesOne == 2) {
				System.out.println("Enter the coordinates of the Submarine (3 cells):");
				System.out.println();
				initOne = sc.next().toUpperCase();
				endOne = sc.next().toUpperCase();	
				if (pieces(initialBoardOne, "Submarine", initOne, endOne)) {
					piecesOne++;
					printBoard(initialBoardOne);
					fillArray(initialBoardOne, submarineOne, "Submarine", initOne, endOne);
				}
				System.out.println();
			}
			if (piecesOne == 3) {
				System.out.println("Enter the coordinates of the Cruiser (3 cells):");
				System.out.println();
				initOne = sc.next().toUpperCase();
				endOne = sc.next().toUpperCase();	
				if (pieces(initialBoardOne, "Cruiser", initOne, endOne)) {
					piecesOne++;
					printBoard(initialBoardOne);
					fillArray(initialBoardOne, cruiserOne, "Cruiser", initOne, endOne);
				}
				System.out.println();
			}
			if (piecesOne == 4) {
				System.out.println("Enter the coordinates of the Destroyer (2 cells):");
				System.out.println();
				initOne = sc.next().toUpperCase();
				endOne = sc.next().toUpperCase();	
				if (pieces(initialBoardOne, "Destroyer", initOne, endOne)) {
					piecesOne++;
					printBoard(initialBoardOne);
					fillArray(initialBoardOne, destroyerOne, "Destroyer", initOne, endOne);
				}
				System.out.println();
			}
		}
		// END P1
		// INIT P2
		promptEnterKey();
		
		int piecesTwo = 0;
		String[][] initialBoardTwo = new String[10][];
		String[][] boardFogTwo = new String[10][];
		String[] aircraftCarrierTwo = {" ", " ", " ", " ", " ", "P1", "P2", "P3", "P4", "P5"};
		String[] battleshipTwo = {" ", " ", " ", " ", "P1", "P2", "P3", "P4"};
		String[] submarineTwo = {" ", " ", " ", "P1", "P2", "P3"};
		String[] cruiserTwo = {" ", " "," ", "P1", "P2", "P3"};
		String[] destroyerTwo = {" ", " ", "P1", "P2"};
		String initTwo;
		String endTwo;
		initialBoard(initialBoardTwo);
		initialBoard(boardFogTwo);
		printBoard(initialBoardTwo);
		System.out.println("Player 2, place your ships on the game field");
		System.out.println();
		
		while (piecesTwo != 5) {
			if (piecesTwo == 0) {
				System.out.println("Enter the coordinates of the Aircraft Carrier (5 cells):");
				System.out.println();
				initTwo = sc.next().toUpperCase();
				endTwo = sc.next().toUpperCase();	
				if (pieces(initialBoardTwo, "Aircraft Carrier", initTwo, endTwo)) {
					piecesTwo++;
					printBoard(initialBoardTwo);
					fillArray(initialBoardTwo, aircraftCarrierTwo, "Aircraft Carrier", initTwo, endTwo);
				}
				System.out.println();
			}
			if (piecesTwo == 1) {
				System.out.println("Enter the coordinates of the Battleship (4 cells):");
				System.out.println();
				initTwo = sc.next().toUpperCase();
				endTwo = sc.next().toUpperCase();	
				if (pieces(initialBoardTwo, "Battleship", initTwo, endTwo)) {
					piecesTwo++;
					printBoard(initialBoardTwo);
					fillArray(initialBoardTwo, battleshipTwo, "Battleship", initTwo, endTwo);
				}
				System.out.println();
			}
			if (piecesTwo == 2) {
				System.out.println("Enter the coordinates of the Submarine (3 cells):");
				System.out.println();
				initTwo = sc.next().toUpperCase();
				endTwo = sc.next().toUpperCase();	
				if (pieces(initialBoardTwo, "Submarine", initTwo, endTwo)) {
					piecesTwo++;
					printBoard(initialBoardTwo);
					fillArray(initialBoardTwo, submarineTwo, "Submarine", initTwo, endTwo);
				}
				System.out.println();
			}
			if (piecesTwo == 3) {
				System.out.println("Enter the coordinates of the Cruiser (3 cells):");
				System.out.println();
				initTwo = sc.next().toUpperCase();
				endTwo = sc.next().toUpperCase();	
				if (pieces(initialBoardTwo, "Cruiser", initTwo, endTwo)) {
					piecesTwo++;
					printBoard(initialBoardTwo);
					fillArray(initialBoardTwo, cruiserTwo, "Cruiser", initTwo, endTwo);
				}
				System.out.println();
			}
			if (piecesTwo == 4) {
				System.out.println("Enter the coordinates of the Destroyer (2 cells):");
				System.out.println();
				initTwo = sc.next().toUpperCase();
				endTwo = sc.next().toUpperCase();	
				if (pieces(initialBoardTwo, "Destroyer", initTwo, endTwo)) {
					piecesTwo++;
					printBoard(initialBoardTwo);
					fillArray(initialBoardTwo, destroyerTwo, "Destroyer", initTwo, endTwo);
				}
				System.out.println();
			}
		}
		// END P2
		// INIT BATTLE
		promptEnterKey();
		String position;
		while(noWinner) {
			
			while(turnP1) {
				printBoard(boardFogOne);
				System.out.println("---------------------");
				printBoard(initialBoardOne);
				System.out.println();
				System.out.println("Player 1, it's your turn:");
				System.out.println();
				position = sc.next();
				fogWar(initialBoardTwo, boardFogOne, initialBoardTwo, aircraftCarrierTwo, battleshipTwo, submarineTwo, cruiserTwo, destroyerTwo, position);
				if (endGame(aircraftCarrierTwo, battleshipTwo, submarineTwo, cruiserTwo, destroyerTwo)) {
					noWinner = false;
				}
				else {
					turnP1 = false;
					turnP2 = true;
				}
			}
			promptEnterKey();
			while(turnP2) {
				printBoard(boardFogTwo);
				System.out.println("---------------------");
				printBoard(initialBoardTwo);
				System.out.println();
				System.out.println("Player 2, it's your turn:");
				System.out.println();
				position = sc.next();
				fogWar(initialBoardOne, boardFogTwo, initialBoardOne, aircraftCarrierOne, battleshipOne, submarineOne, cruiserOne, destroyerOne, position);
				if (endGame(aircraftCarrierOne, battleshipOne, submarineOne, cruiserOne, destroyerOne)) {
					noWinner = false;
				}
				else {
					turnP1 = true;
					turnP2 = false;
				}
			}
			promptEnterKey();
		}
		
	}

	public static void initialBoard(String[][] initialBoard) {
		for (int i = 0; i < initialBoard.length; i++) {
			String[] aux = {"", "~", "~", "~", "~", "~", "~", "~", "~", "~", "~"};
			switch (i) {
			case 0:
				aux[0] = "A";
				break;
			case 1:
				aux[0] = "B";
				break;
			case 2:
				aux[0] = "C";
				break;
			case 3:
				aux[0] = "D";
				break;
			case 4:
				aux[0] = "E";
				break;
			case 5:
				aux[0] = "F";
				break;
			case 6:
				aux[0] = "G";
				break;
			case 7:
				aux[0] = "H";
				break;
			case 8:
				aux[0] = "I";
				break;
			case 9:
				aux[0] = "J";
				break;
			}
			initialBoard[i] = aux;
		}
	}
	
	public static void printBoard(String[][] board) {
		String printHead = "  1 2 3 4 5 6 7 8 9 10";
		System.out.println(printHead);
		for (int i = 0; i < board.length; i++) {
			String aux = "";
			for (int j = 0; j <= board.length; j++) {
				aux += board[i][j] + " ";
			}
			System.out.println(aux);
			aux = "";
		}
		System.out.println();
	}
	
	public static Integer verifyRow(String letter) {
		switch (letter.toUpperCase()) {
		case "A":
			return 0;
		case "B":
			return 1;
		case "C":
			return 2;
		case "D":
			return 3;
		case "E":
			return 4;
		case "F":
			return 5;
		case "G":
			return 6;
		case "H":
			return 7;
		case "I":
			return 8;
		case "J":
			return 9;
		default:
			return null;
		}
	}

	
	public static boolean pieces(String[][] board, String piece, String init, String end) {
		String[] valuesInit =  init.split("");
		String[] valuesEnd =  end.split("");
		if (valuesInit.length > 2 || valuesEnd.length > 2) {
			String[] auxOne = init.split("");
			String[] auxTwo =  end.split("");
			valuesInit[0] = auxOne[0];
			valuesInit[1] = valuesInit.length > 2 ? auxOne[1] + auxOne[2]: auxOne[1];
			valuesEnd[0] = auxTwo[0];
			valuesEnd[1] = valuesEnd.length > 2 ? auxTwo[1] + auxTwo[2] : auxTwo[1];
		}
		int auxA = valuesInit[0].contains("A") ? 1 : verifyRow(valuesInit[0]);
		int auxB = valuesEnd[0].contains("A") ? 1 : verifyRow(valuesEnd[0]);
		int sizeInline = auxA + auxB;
		if (piece.toLowerCase().contains("aircraft carrier")) {
			if ((Math.abs(Integer.parseInt(valuesEnd[1]) - Integer.parseInt(valuesInit[1])) + 1) > pieceLength("aircraft carrier") || sizeInline < pieceLength("aircraft carrier")) {
				System.out.println("Error! Wrong length of the Aircraft Carrier! Try again:");
				return false;
			} 
			else if (!valuesInit[0].contains(valuesEnd[0]) && !valuesInit[1].contains(valuesEnd[1])) {
				System.out.println("Error! Wrong ship location! Try again:");
				return false;
			}
			else if (pieceNearby(board, init, end, "aircraft carrier")) {
				System.out.println("Error! You placed it too close to another one. Try again:");
				return false;
			}
			else {
				if (Integer.parseInt(valuesEnd[1]) < Integer.parseInt(valuesInit[1])) {
					if (valuesInit[0].contains(valuesEnd[0])) {
						int decrement = Integer.parseInt(valuesInit[1]);
						int auxArray = verifyRow(valuesInit[0]);
						for (int i = 0; i < 5; i++) {
							board[auxArray][decrement] = "O";
							decrement--;
						}
					} // OK
				}
				else if (Integer.parseInt(valuesEnd[1]) > Integer.parseInt(valuesInit[1])) {
					if (valuesInit[0].contains(valuesEnd[0])) {
						int increment = Integer.parseInt(valuesInit[1]);
						int auxArray = verifyRow(valuesInit[0]);
						for (int i = 0; i < 5; i++) {
							board[auxArray][increment] = "O";
							increment++;
						}
					} // OK
				}
				else if (Integer.parseInt(valuesEnd[1]) == Integer.parseInt(valuesInit[1])) {
					int decrement = verifyRow(valuesInit[0]) > verifyRow(valuesEnd[0]) ? verifyRow(valuesInit[0]) : verifyRow(valuesEnd[0]);
					int auxArray = Integer.parseInt(valuesEnd[1]);
					for (int i = 0; i < 5; i++) {
						board[decrement][auxArray] = "O";
						decrement--;
					} // OK
				}
				return true;
			}
		}
		if (piece.toLowerCase().contains("battleship")) {
			if ((Math.abs(Integer.parseInt(valuesEnd[1]) - Integer.parseInt(valuesInit[1])) + 1) > pieceLength("battleship") || sizeInline < pieceLength("battleship")) {
				System.out.println("Error! Wrong length of the Battleship! Try again:");
				return false;
			} 
			else if (!valuesInit[0].contains(valuesEnd[0]) && !valuesInit[1].contains(valuesEnd[1])) {
				System.out.println("Error! Wrong ship location! Try again:");
				return false;
			}
			else if (pieceNearby(board, init, end, "battleship")) {
				System.out.println("Error! You placed it too close to another one. Try again:");
				return false;
			}
			else {
				if (Integer.parseInt(valuesEnd[1]) < Integer.parseInt(valuesInit[1])) {
					if (valuesInit[0].contains(valuesEnd[0])) {
						int decrement = Integer.parseInt(valuesInit[1]);
						int auxArray = verifyRow(valuesInit[0]);
						for (int i = 0; i < 4; i++) {
							board[auxArray][decrement] = "O";
							decrement--;
						}
					} // OK
				}
				else if (Integer.parseInt(valuesEnd[1]) > Integer.parseInt(valuesInit[1])) {
					if (valuesInit[0].contains(valuesEnd[0])) {
						int increment = Integer.parseInt(valuesInit[1]);
						int auxArray = verifyRow(valuesInit[0]);
						for (int i = 0; i < 4; i++) {
							board[auxArray][increment] = "O";
							increment++;
						}
					} // OK
				}
				else if (Integer.parseInt(valuesEnd[1]) == Integer.parseInt(valuesInit[1])) {
					int decrement = verifyRow(valuesInit[0]) > verifyRow(valuesEnd[0]) ? verifyRow(valuesInit[0]) : verifyRow(valuesEnd[0]);
					int auxArray = Integer.parseInt(valuesEnd[1]);
					for (int i = 0; i < 4; i++) {
						board[decrement][auxArray] = "O";
						decrement--;
					} // OK
				}
				return true;
			}
		}
		if (piece.toLowerCase().contains("submarine")) {
			if ((Math.abs(Integer.parseInt(valuesEnd[1]) - Integer.parseInt(valuesInit[1])) + 1) >  pieceLength("submarine") || sizeInline < pieceLength("submarine")) {
				System.out.println("Error! Wrong length of the Submarine! Try again:");
				return false;
			} 
			else if (!valuesInit[0].contains(valuesEnd[0]) && !valuesInit[1].contains(valuesEnd[1])) {
				System.out.println("Error! Wrong ship location! Try again:");
				return false;
			}
			else if (pieceNearby(board, init, end, "submarine")) {
				System.out.println("Error! You placed it too close to another one. Try again:");
				return false;
			}
			else {
				if (Integer.parseInt(valuesEnd[1]) < Integer.parseInt(valuesInit[1])) {
					if (valuesInit[0].contains(valuesEnd[0])) {
						int decrement = Integer.parseInt(valuesInit[1]);
						int auxArray = verifyRow(valuesInit[0]);
						for (int i = 0; i < 3; i++) {
							board[auxArray][decrement] = "O";
							decrement--;
						}
					} // OK
				}
				else if (Integer.parseInt(valuesEnd[1]) > Integer.parseInt(valuesInit[1])) {
					if (valuesInit[0].contains(valuesEnd[0])) {
						int increment = Integer.parseInt(valuesInit[1]);
						int auxArray = verifyRow(valuesInit[0]);
						for (int i = 0; i < 3; i++) {
							board[auxArray][increment] = "O";
							increment++;
						}
					} // OK
				}
				else if (Integer.parseInt(valuesEnd[1]) == Integer.parseInt(valuesInit[1])) {
					int decrement = verifyRow(valuesInit[0]) > verifyRow(valuesEnd[0]) ? verifyRow(valuesInit[0]) : verifyRow(valuesEnd[0]);
					int auxArray = Integer.parseInt(valuesEnd[1]);
					for (int i = 0; i < 3; i++) {
						board[decrement][auxArray] = "O";
						decrement--;
					} // OK
				}
				return true;
			}
		}
		if (piece.toLowerCase().contains("cruiser")) {
			if ((Math.abs(Integer.parseInt(valuesEnd[1]) - Integer.parseInt(valuesInit[1])) + 1) > pieceLength("cruiser") || sizeInline < pieceLength("cruiser")) {
				System.out.println("Error! Wrong length of the Cruiser! Try again:");
				return false;
			} 
			else if (!valuesInit[0].contains(valuesEnd[0]) && !valuesInit[1].contains(valuesEnd[1])) {
				System.out.println("Error! Wrong ship location! Try again:");
				return false;
			}
			else if (pieceNearby(board, init, end, "cruiser")) {
				System.out.println("Error! You placed it too close to another one. Try again:");
				return false;
			}
			else {
				if (Integer.parseInt(valuesEnd[1]) < Integer.parseInt(valuesInit[1])) {
					if (valuesInit[0].contains(valuesEnd[0])) {
						int decrement = Integer.parseInt(valuesInit[1]);
						int auxArray = verifyRow(valuesInit[0]);
						for (int i = 0; i < 3; i++) {
							board[auxArray][decrement] = "O";
							decrement--;
						}
					} // OK
				}
				else if (Integer.parseInt(valuesEnd[1]) > Integer.parseInt(valuesInit[1])) {
					if (valuesInit[0].contains(valuesEnd[0])) {
						int increment = Integer.parseInt(valuesInit[1]);
						int auxArray = verifyRow(valuesInit[0]);
						for (int i = 0; i < 3; i++) {
							board[auxArray][increment] = "O";
							increment++;
						}
					} // OK
				}
				else if (Integer.parseInt(valuesEnd[1]) == Integer.parseInt(valuesInit[1])) {
					int decrement = verifyRow(valuesInit[0]) > verifyRow(valuesEnd[0]) ? verifyRow(valuesInit[0]) : verifyRow(valuesEnd[0]);
					int auxArray = Integer.parseInt(valuesEnd[1]);
					for (int i = 0; i < 3; i++) {
						board[decrement][auxArray] = "O";
						decrement--;
					} // OK
				}
				return true;
			}
		}
		if (piece.toLowerCase().contains("destroyer")) {
			if ((Math.abs(Integer.parseInt(valuesEnd[1]) - Integer.parseInt(valuesInit[1])) + 1) > pieceLength("destroyer") || sizeInline < pieceLength("cruiser")) {
				System.out.println("Error! Wrong length of the Destroyer! Try again:");
				return false;
			} 
			else if (!valuesInit[0].contains(valuesEnd[0]) && !valuesInit[1].contains(valuesEnd[1])) {
				System.out.println("Error! Wrong ship location! Try again:");
				return false;
			}
			else if (pieceNearby(board, init, end, "destroyer")) {
				System.out.println("Error! You placed it too close to another one. Try again:");
				return false;
			}
			else {
				if (Integer.parseInt(valuesEnd[1]) < Integer.parseInt(valuesInit[1])) {
					if (valuesInit[0].contains(valuesEnd[0])) {
						int decrement = Integer.parseInt(valuesInit[1]);
						int auxArray = verifyRow(valuesInit[0]);
						for (int i = 0; i < 2; i++) {
							board[auxArray][decrement] = "O";
							decrement--;
						}
					} // OK
				}
				else if (Integer.parseInt(valuesEnd[1]) > Integer.parseInt(valuesInit[1])) {
					if (valuesInit[0].contains(valuesEnd[0])) {
						int increment = Integer.parseInt(valuesInit[1]);
						int auxArray = verifyRow(valuesInit[0]);
						for (int i = 0; i < 2; i++) {
							board[auxArray][increment] = "O";
							increment++;
						}
					} // OK
				}
				else if (Integer.parseInt(valuesEnd[1]) == Integer.parseInt(valuesInit[1])) {
					int decrement = verifyRow(valuesInit[0]) > verifyRow(valuesEnd[0]) ? verifyRow(valuesInit[0]) : verifyRow(valuesEnd[0]);
					int auxArray = Integer.parseInt(valuesEnd[1]);
					for (int i = 0; i < 2; i++) {
						board[decrement][auxArray] = "O";
						decrement--;
					} // OK
				}
				return true;
			}
		}
		return false;
	}
	
	public static boolean pieceNearby(String[][] board, String init, String end, String piece) {
		String[] valuesInit =  init.split("");
		String[] valuesEnd =  end.split("");
		if (valuesInit.length > 2 || valuesEnd.length > 2) {
			String[] auxOne = init.split("");
			String[] auxTwo =  end.split("");
			valuesInit[0] = auxOne[0];
			valuesInit[1] = valuesInit.length > 2 ? auxOne[1] + auxOne[2]: auxOne[1];
			valuesEnd[0] = auxTwo[0];
			valuesEnd[1] = valuesEnd.length > 2 ? auxTwo[1] + auxTwo[2] : auxTwo[1];
		}
		if (Integer.parseInt(valuesEnd[1]) < Integer.parseInt(valuesInit[1])) {
			if (valuesInit[0].contains(valuesEnd[0])) {
				int line = Integer.parseInt(valuesInit[1]);
				int auxArray = verifyRow(valuesInit[0]);
				for (int i = 0; i < pieceLength(piece); i++) {
					try {
						if (board[auxArray + 1][line - 1].contains("O") || board[auxArray][line - 1].contains("O") || board[auxArray - 1][line - 1].contains("O")) {
							return true;
						}
						line--;
					} catch (Exception e) {
						line--;
					}
				}
			} // OK
		}
		else if (Integer.parseInt(valuesEnd[1]) > Integer.parseInt(valuesInit[1])) {
			if (valuesInit[0].contains(valuesEnd[0])) {
				int line = Integer.parseInt(valuesInit[1]);
				int auxArray = verifyRow(valuesInit[0]);
				for (int i = 0; i < pieceLength(piece); i++) {
					try {
						if (board[auxArray + 1][line + 1].contains("O") || board[auxArray][line + 1].contains("O") || board[auxArray - 1][line + 1].contains("O")) {
							return true;
						}
						line--;
					} catch (Exception e) {
						line--;
					}
				}
			} // OK
		}
		else if (Integer.parseInt(valuesEnd[1]) == Integer.parseInt(valuesInit[1])) {
			int auxArray = verifyRow(valuesInit[0]) > verifyRow(valuesEnd[0]) ? verifyRow(valuesInit[0]) : verifyRow(valuesEnd[0]);
			int line = Integer.parseInt(valuesEnd[1]);
			for (int i = 0; i <= pieceLength(piece); i++) {
				try {
					if (board[auxArray + 1][line - 1].contains("O") || board[auxArray + 1][line].contains("O") || board[auxArray + 1][line + 1].contains("O")) {
						return true;
					}
					auxArray--;
				} catch (Exception e) {
					auxArray--;
				}
			} // OK
		}
		return false;
	}
	
	public static int pieceLength(String piece) {
		switch (piece.toLowerCase()) {
			case "destroyer":
				return 2;
			case "cruiser":
				return 3;
			case "submarine":
				return 3;
			case "battleship":
				return 4;
			case "aircraft carrier":
				return 5;
			default:
				return 0;
		}
	}
		
	public static void fogWar(String[][] initialBoardOne, String[][] boardFogOne, String[][] initialBoardTwo, String[] aircraft , String[] battleship, String[] submarine, String[] cruiser, String[] destroyer, String position) {
		String[] shot =  position.toUpperCase().split("");
		if (shot.length > 2) {
			String[] auxOne = position.split("");
			shot[0] = auxOne[0];
			shot[1] = shot.length > 2 ? auxOne[1] + auxOne[2] : auxOne[1];
		}
		Integer row = verifyRow(shot[0]);
		if (row == null || Integer.parseInt(shot[1]) > 10) {
			System.out.println();
			System.out.println("Error! You entered the wrong coordinates! Try again:");
			System.out.println();
		}
		else if (initialBoardOne[row][Integer.parseInt(shot[1])].contains("O")) {
			boardFogOne[row][Integer.parseInt(shot[1])] = "X";
			initialBoardTwo[row][Integer.parseInt(shot[1])] = "X";
			verifyShot(aircraft, battleship, submarine, cruiser, destroyer, position);
			System.out.println();
		} 
		else {
			boardFogOne[row][Integer.parseInt(shot[1])] = "M";
			initialBoardTwo[row][Integer.parseInt(shot[1])] = "M";
			System.out.println();
			System.out.println("You missed. Try again:");
			System.out.println();
		}
	}
	
	public static void fillArray(String[][] initialBoard, String[] ship, String piece, String init, String end) {
		String[] valuesInit =  init.split("");
		String[] valuesEnd =  end.split("");
		if (valuesInit.length > 2 || valuesEnd.length > 2) {
			String[] auxOne = init.split("");
			String[] auxTwo =  end.split("");
			valuesInit[0] = auxOne[0];
			valuesInit[1] = valuesInit.length > 2 ? auxOne[1] + auxOne[2]: auxOne[1];
			valuesEnd[0] = auxTwo[0];
			valuesEnd[1] = valuesEnd.length > 2 ? auxTwo[1] + auxTwo[2] : auxTwo[1];
		}
		int size = Math.abs(Integer.parseInt(valuesInit[1]) - Integer.parseInt(valuesEnd[1])) + 1;
		int lowestNumber = Integer.parseInt(valuesInit[1]) > Integer.parseInt(valuesEnd[1]) ? Integer.parseInt(valuesEnd[1]) : Integer.parseInt(valuesInit[1]);
		int lowestLetter = verifyRow(valuesInit[0]) > verifyRow(valuesEnd[0]) ? verifyRow(valuesEnd[0]) : verifyRow(valuesInit[0]);
		if (piece.toLowerCase().contains("aircraft carrier")) {
			if (valuesInit[0].contains(valuesEnd[0])) {
				for (int i = 0; i < 5; i++) {
					ship[i] = "HAS";
				}
				for (int i = 5; i < 10; i++) {
					ship[i] = valuesInit[0] + lowestNumber;
					lowestNumber++;
				}
			} else {
				for (int i = 0; i < 5; i++) {
					ship[i] = "HAS";
				}
				for (int i = 5; i < 10; i++) {
					ship[i] = initialBoard[lowestLetter][0] + valuesInit[1];
					lowestLetter++;
				}
			}
		}
		else if (piece.toLowerCase().contains("battleship")) {
			if (valuesInit[0].contains(valuesEnd[0])) {
				for (int i = 0; i < 4; i++) {
					ship[i] = "HAS";
				}
				for (int i = 4; i < 8; i++) {
					ship[i] = valuesInit[0] + lowestNumber;
					lowestNumber++;
				}
			} else {
				for (int i = 0; i < 4; i++) {
					ship[i] = "HAS";
				}
				for (int i = 4; i < 8; i++) {
					ship[i] = initialBoard[lowestLetter][0] + valuesInit[1];
					lowestLetter++;
				}
			}
		}
		else if (piece.toLowerCase().contains("submarine")) {
			if (valuesInit[0].contains(valuesEnd[0])) {
				for (int i = 0; i < 3; i++) {
					ship[i] = "HAS";
				}
				for (int i = 3; i < 6; i++) {
					ship[i] = valuesInit[0] + lowestNumber;
					lowestNumber++;
				}
			} else {
				for (int i = 0; i < 3; i++) {
					ship[i] = "HAS";
				}
				for (int i = 3; i < 6; i++) {
					ship[i] = initialBoard[lowestLetter][0] + valuesInit[1];
					lowestLetter++;
				}
			}
		}
		else if (piece.toLowerCase().contains("cruiser")) {
			if (valuesInit[0].contains(valuesEnd[0])) {
				for (int i = 0; i < 3; i++) {
					ship[i] = "HAS";
				}
				for (int i = 3; i < 6; i++) {
					ship[i] = valuesInit[0] + lowestNumber;
					lowestNumber++;
				}
			} else {
				for (int i = 0; i < 3; i++) {
					ship[i] = "HAS";
				}
				for (int i = 3; i < 6; i++) {
					ship[i] = initialBoard[lowestLetter][0] + valuesInit[1];
					lowestLetter++;
				}
			}
		}
		else if (piece.toLowerCase().contains("destroyer")) {
			if (valuesInit[0].contains(valuesEnd[0])) {
				for (int i = 0; i < 2; i++) {
					ship[i] = "HAS";
				}
				for (int i = 2; i < 4; i++) {
					ship[i] = valuesInit[0] + lowestNumber;
					lowestNumber++;
				}
			} else {
				for (int i = 0; i < 2; i++) {
					ship[i] = "HAS";
				}
				for (int i = 2; i < 4; i++) {
					ship[i] = initialBoard[lowestLetter][0] + valuesInit[1];
					lowestLetter++;
				}
			}
		}
	}
	
	public static boolean endGame(String[] aircraft , String[] battleship, String[] submarine, String[] cruiser, String[] destroyer) {
		boolean[] trueEnd = {false, false, false, false, false};
		for (int i = 0; i < aircraft.length; i++) {
			if (!aircraft[i].contains("X")) {
				break;
			}
			if (aircraft[aircraft.length - 1].contains("X")) {
				trueEnd[0] = true;
				break;
			}
		}
		for (int i = 0; i < battleship.length; i++) {
			if (!battleship[i].contains("X")) {
				break;
			}
			if (battleship[battleship.length - 1].contains("X")) {
				trueEnd[1] = true;
			}
		}
		for (int i = 0; i < submarine.length; i++) {
			if (!submarine[i].contains("X")) {
				break;
			}
			if (submarine[submarine.length - 1].contains("X")) {
				trueEnd[2] = true;
				break;
			}
		}
		for (int i = 0; i < cruiser.length; i++) {
			if (!cruiser[i].contains("X")) {
				break;
			}
			if (cruiser[cruiser.length - 1].contains("X")) {
				trueEnd[3] = true;
				break;
			}
		}
		for (int i = 0; i < destroyer.length; i++) {
			if (!destroyer[i].contains("X")) {
				break;
			}
			if (destroyer[destroyer.length - 1].contains("X")) {
				trueEnd[4] = true;
				break;
			}
		}
		if (trueEnd[0] == true && trueEnd[1] == true && trueEnd[2] == true && trueEnd[3] == true && trueEnd[4] == true) {
			return true;
		}
		return false;
	}
	
	public static void verifyShot(String[] aircraft , String[] battleship, String[] submarine, String[] cruiser, String[] destroyer, String position) {
		for (int i = 5; i < aircraft.length; i++) {
			if (aircraft[i].contains(position)) {
				aircraft[i] = "X";
				aircraft[i - 5] = "X";
				if (endGame(aircraft , battleship, submarine, cruiser, destroyer)) {
					System.out.println("You sank the last ship. You won. Congratulations!");
					break;
				}
				if (aircraft[5].contains("X") && aircraft[6].contains("X") && aircraft[7].contains("X") && aircraft[8].contains("X") && aircraft[9].contains("X")) {
					System.out.println("You sank a ship! Specify a new target:");
					System.out.println();
				}
				else {
					System.out.println("You hit a ship! Try again:");
					System.out.println();
				}
			}
		}
		for (int i = 4; i < battleship.length; i++) {
			if (battleship[i].contains(position)) {
				battleship[i] = "X";
				battleship[i - 4] = "X";
				if (endGame(aircraft , battleship, submarine, cruiser, destroyer)) {
					System.out.println("You sank the last ship. You won. Congratulations!");
					break;
				}
				if (battleship[4].contains("X") && battleship[5].contains("X") && battleship[6].contains("X") && battleship[7].contains("X")) {
					System.out.println("You sank a ship! Specify a new target:");
					System.out.println();
				}
				else {
					System.out.println("You hit a ship! Try again:");
					System.out.println();
				}
			}
		}
		for (int i = 3; i < cruiser.length; i++) {
			if (cruiser[i].contains(position)) {
				cruiser[i] = "X";
				cruiser[i - 3] = "X";
				if (endGame(aircraft , battleship, submarine, cruiser, destroyer)) {
					System.out.println("You sank the last ship. You won. Congratulations!");
					break;
				}
				if (cruiser[3].contains("X") && battleship[4].contains("X") && battleship[5].contains("X")) {
					System.out.println("You sank a ship! Specify a new target:");
					System.out.println();
				}
				else {
					System.out.println("You hit a ship! Try again:");
					System.out.println();
				}
			}
		}
		for (int i = 3; i < submarine.length; i++) {
			if (submarine[i].contains(position)) {
				submarine[i] = "X";
				submarine[i - 3] = "X";
				if (endGame(aircraft , battleship, submarine, cruiser, destroyer)) {
					System.out.println("You sank the last ship. You won. Congratulations!");
					break;
				}
				if (submarine[3].contains("X") && submarine[4].contains("X") && submarine[5].contains("X")) {
					System.out.println("You sank a ship! Specify a new target:");
					System.out.println();
				}
				else {
					System.out.println("You hit a ship! Try again:");
					System.out.println();
				}
			}
		}
		for (int i = 2; i < destroyer.length; i++) {
			if (destroyer[i].contains(position)) {
				destroyer[i] = "X";
				destroyer[i - 2] = "X";
				if (endGame(aircraft , battleship, submarine, cruiser, destroyer)) {
					System.out.println("You sank the last ship. You won. Congratulations!");
					break;
				}
				if (destroyer[2].contains("X") && destroyer[3].contains("X")) {
					System.out.println("You sank a ship! Specify a new target:");
					System.out.println();
				}
				else {
					System.out.println("You hit a ship! Try again:");
					System.out.println();
				}
			}
		}
		
	}
	
	  public static void promptEnterKey() {
	        System.out.println("Press Enter and pass the move to another player");
	        try {
	            System.in.read();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
}
