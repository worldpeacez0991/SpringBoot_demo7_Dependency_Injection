package com.example.chessDemo.controller;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.chessDemo.ChessBeans;
import com.example.chessDemo.DemoApplication;
import com.example.chessDemo.model.Piece;

@RestController
public class ChessController {
	private static final Logger log = LoggerFactory.getLogger(DemoApplication.class);

	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public ModelAndView home() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("home"); // resources/template/home.html
		return modelAndView;
	}

	@RequestMapping(value = "/chess_start_positions", method = RequestMethod.GET)
	public ModelAndView hello(Model model) {
		List<Piece> all_pieces = getPieces();

		List<Piece> white_pieces = all_pieces.stream().filter((piece) -> piece.side().equals("White"))
				.collect(Collectors.toList());
		List<Piece> black_pieces = all_pieces.stream().filter((piece) -> piece.side().equals("Black"))
				.collect(Collectors.toList());

		model.addAttribute("whitePieces", white_pieces);
		model.addAttribute("blackPieces", black_pieces);

		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("chess_start_positions"); // resources/template/home.html
		return modelAndView;
	}

	private List<Piece> getPieces() {
		ApplicationContext context = new AnnotationConfigApplicationContext(ChessBeans.class);
		Piece wp1 = context.getBean("white_pawn1", Piece.class);
		Piece wp2 = context.getBean("white_pawn2", Piece.class);
		Piece wp3 = context.getBean("white_pawn3", Piece.class);
		Piece wp4 = context.getBean("white_pawn4", Piece.class);
		Piece wp5 = context.getBean("white_pawn5", Piece.class);
		Piece wp6 = context.getBean("white_pawn6", Piece.class);
		Piece wp7 = context.getBean("white_pawn7", Piece.class);
		Piece wp8 = context.getBean("white_pawn8", Piece.class);
		Piece wp9 = context.getBean("white_rook1", Piece.class);
		Piece wp10 = context.getBean("white_rook2", Piece.class);
		Piece wp11 = context.getBean("white_knight1", Piece.class);
		Piece wp12 = context.getBean("white_knight2", Piece.class);
		Piece wp13 = context.getBean("white_bishop1", Piece.class);
		Piece wp14 = context.getBean("white_bishop2", Piece.class);
		Piece wp15 = context.getBean("white_king", Piece.class);
		Piece wp16 = context.getBean("white_queen", Piece.class);

		Piece bp1 = context.getBean("black_pawn1", Piece.class);
		Piece bp2 = context.getBean("black_pawn2", Piece.class);
		Piece bp3 = context.getBean("black_pawn3", Piece.class);
		Piece bp4 = context.getBean("black_pawn4", Piece.class);
		Piece bp5 = context.getBean("black_pawn5", Piece.class);
		Piece bp6 = context.getBean("black_pawn6", Piece.class);
		Piece bp7 = context.getBean("black_pawn7", Piece.class);
		Piece bp8 = context.getBean("black_pawn8", Piece.class);
		Piece bp9 = context.getBean("black_rook1", Piece.class);
		Piece bp10 = context.getBean("black_rook2", Piece.class);
		Piece bp11 = context.getBean("black_knight1", Piece.class);
		Piece bp12 = context.getBean("black_knight2", Piece.class);
		Piece bp13 = context.getBean("black_bishop1", Piece.class);
		Piece bp14 = context.getBean("black_bishop2", Piece.class);
		Piece bp15 = context.getBean("black_king", Piece.class);
		Piece bp16 = context.getBean("black_queen", Piece.class);

		log.info("Showing White pieces...");
		log.info("wp1: " + wp1.toString());
		log.info("wp2: " + wp2.toString());
		log.info("wp3: " + wp3.toString());
		log.info("wp4: " + wp4.toString());
		log.info("wp5: " + wp5.toString());
		log.info("wp6: " + wp6.toString());
		log.info("wp7: " + wp7.toString());
		log.info("wp8: " + wp8.toString());
		log.info("wp9: " + wp9.toString());
		log.info("wp10: " + wp10.toString());
		log.info("wp11: " + wp11.toString());
		log.info("wp12: " + wp12.toString());
		log.info("wp13: " + wp13.toString());
		log.info("wp14: " + wp14.toString());
		log.info("wp15: " + wp15.toString());
		log.info("wp16: " + wp16.toString());
		log.info("");
		log.info("Showing Black pieces...");
		log.info("bp1: " + bp1.toString());
		log.info("bp2: " + bp2.toString());
		log.info("bp3: " + bp3.toString());
		log.info("bp4: " + bp4.toString());
		log.info("bp5: " + bp5.toString());
		log.info("bp6: " + bp6.toString());
		log.info("bp7: " + bp7.toString());
		log.info("bp8: " + bp8.toString());
		log.info("bp9: " + bp9.toString());
		log.info("bp10: " + bp10.toString());
		log.info("bp11: " + bp11.toString());
		log.info("bp12: " + bp12.toString());
		log.info("bp13: " + bp13.toString());
		log.info("bp14: " + bp14.toString());
		log.info("bp15: " + bp15.toString());
		log.info("bp16: " + bp16.toString());

		List<Piece> pawn_pieces = Arrays.asList(wp1, wp2, wp3, wp4, wp5, wp6, wp7, wp8, wp9, wp10, wp11, wp12, wp13,
				wp14, wp15, wp16, bp1, bp2, bp3, bp4, bp5, bp6, bp7, bp8, bp9, bp10, bp11, bp12, bp13, bp14, bp15,
				bp16);
		((AbstractApplicationContext) context).close();

		return pawn_pieces;
	}
}
