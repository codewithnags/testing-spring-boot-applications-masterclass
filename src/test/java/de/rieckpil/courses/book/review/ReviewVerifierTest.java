package de.rieckpil.courses.book.review;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;


public class ReviewVerifierTest {

  private ReviewVerifier reviewVerifier;

  @BeforeEach
  public void setUp() {
    reviewVerifier = new ReviewVerifier();
  }

  @Test
  void shouldFailWhenReviewContainsSwearWord() {
    String review = "This book is shit";
    System.out.println("Testing a review");

    boolean result = reviewVerifier.doesMeetQualityStandards(review);

    assertFalse(result,"ReviewVerifier did mot detect swear word");
    assertEquals(false,result);
  }

  @Test
  @DisplayName("should fail when review contans 'lorem ipsum'")
  void testLoremIpsum(){
    String review = "lorem ipsum";

    boolean result = reviewVerifier.doesMeetQualityStandards(review);

    assertFalse(result,"ReviewVerifier did mot detect lorem ipsum");
  }

}
