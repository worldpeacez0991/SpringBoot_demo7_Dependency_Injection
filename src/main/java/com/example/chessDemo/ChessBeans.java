package com.example.chessDemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.chessDemo.model.Piece;

@Configuration
public class ChessBeans {

	@Bean(name = "white_pawn1")
	public Piece getWhitePiece1() {
		Piece p = new Piece("White", "Pawn", "a2");
		return p;
	}

	@Bean(name = "white_pawn2")
	public Piece getWhitePiece2() {
		Piece p = new Piece("White", "Pawn", "b2");
		return p;
	}

	@Bean(name = "white_pawn3")
	public Piece getWhitePiece3() {
		Piece p = new Piece("White", "Pawn", "c2");
		return p;
	}

	@Bean(name = "white_pawn4")
	public Piece getWhitePiece4() {
		Piece p = new Piece("White", "Pawn", "d2");
		return p;
	}

	@Bean(name = "white_pawn5")
	public Piece getWhitePiece5() {
		Piece p = new Piece("White", "Pawn", "e2");
		return p;
	}

	@Bean(name = "white_pawn6")
	public Piece getWhitePiece6() {
		Piece p = new Piece("White", "Pawn", "f2");
		return p;
	}

	@Bean(name = "white_pawn7")
	public Piece getWhitePiece7() {
		Piece p = new Piece("White", "Pawn", "g2");
		return p;
	}

	@Bean(name = "white_pawn8")
	public Piece getWhitePiece8() {
		Piece p = new Piece("White", "Pawn", "h2");
		return p;
	}

	@Bean(name = "black_pawn1")
	public Piece getBlackPiece1() {
		Piece p = new Piece("Black", "Pawn", "a7");
		return p;
	}

	@Bean(name = "black_pawn2")
	public Piece getBlackPiece2() {
		Piece p = new Piece("Black", "Pawn", "b7");
		return p;
	}

	@Bean(name = "black_pawn3")
	public Piece getBlackPiece3() {
		Piece p = new Piece("Black", "Pawn", "c7");
		return p;
	}

	@Bean(name = "black_pawn4")
	public Piece getBlackPiece4() {
		Piece p = new Piece("Black", "Pawn", "d7");
		return p;
	}

	@Bean(name = "black_pawn5")
	public Piece getBlackPiece5() {
		Piece p = new Piece("Black", "Pawn", "e7");
		return p;
	}

	@Bean(name = "black_pawn6")
	public Piece getBlackPiece6() {
		Piece p = new Piece("Black", "Pawn", "f7");
		return p;
	}

	@Bean(name = "black_pawn7")
	public Piece getBlackPiece7() {
		Piece p = new Piece("Black", "Pawn", "g7");
		return p;
	}

	@Bean(name = "black_pawn8")
	public Piece getBlackPiece8() {
		Piece p = new Piece("Black", "Pawn", "h7");
		return p;
	}

	@Bean(name = "white_rook1")
	public Piece getWhitePiece9() {
		Piece p = new Piece("White", "Rook1", "a1");
		return p;
	}

	@Bean(name = "white_rook2")
	public Piece getWhitePiece10() {
		Piece p = new Piece("White", "Rook2", "h1");
		return p;
	}

	@Bean(name = "white_knight1")
	public Piece getWhitePiece11() {
		Piece p = new Piece("White", "Knight1", "b1");
		return p;
	}

	@Bean(name = "white_knight2")
	public Piece getWhitePiece12() {
		Piece p = new Piece("White", "Knight2", "g1");
		return p;
	}

	@Bean(name = "white_bishop1")
	public Piece getWhitePiece13() {
		Piece p = new Piece("White", "Bishop1", "c1");
		return p;
	}

	@Bean(name = "white_bishop2")
	public Piece getWhitePiece14() {
		Piece p = new Piece("White", "Bishop2", "f1");
		return p;
	}

	@Bean(name = "white_king")
	public Piece getWhitePiece15() {
		Piece p = new Piece("White", "King", "e1");
		return p;
	}

	@Bean(name = "white_queen")
	public Piece getWhitePiece16() {
		Piece p = new Piece("White", "Queen", "d1");
		return p;
	}

	@Bean(name = "black_rook1")
	public Piece getBlackPiece9() {
		Piece p = new Piece("Black", "Rook1", "a8");
		return p;
	}

	@Bean(name = "black_rook2")
	public Piece getBlackPiece10() {
		Piece p = new Piece("Black", "Rook2", "h8");
		return p;
	}

	@Bean(name = "black_knight1")
	public Piece getBlackPiece11() {
		Piece p = new Piece("Black", "Knight1", "b8");
		return p;
	}

	@Bean(name = "black_knight2")
	public Piece getBlackPiece12() {
		Piece p = new Piece("Black", "Knight2", "g8");
		return p;
	}

	@Bean(name = "black_bishop1")
	public Piece getBlackPiece13() {
		Piece p = new Piece("Black", "Bishop1", "c8");
		return p;
	}

	@Bean(name = "black_bishop2")
	public Piece getBlackPiece14() {
		Piece p = new Piece("Black", "Bishop2", "f8");
		return p;
	}

	@Bean(name = "black_king")
	public Piece getBlackPiece15() {
		Piece p = new Piece("Black", "King", "e8");
		return p;
	}

	@Bean(name = "black_queen")
	public Piece getBlackPiece16() {
		Piece p = new Piece("Black", "Queen", "d8");
		return p;
	}

}
