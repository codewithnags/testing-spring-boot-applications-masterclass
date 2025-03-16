package de.rieckpil.courses.book.review;


import org.junit.jupiter.api.*;

public class ReviewVerifierTest {

  private ReviewVerifier reviewVerifier;

  public ReviewVerifierTest(){
    System.out.println("instance of ReviewVerifierTest....");
  }
  @BeforeEach
  public void setUp() {
    System.out.print("Before Each");
    reviewVerifier = new ReviewVerifier();
  }

  @AfterEach
  public void tearDown() {
    System.out.print("After Each");
  }

  @BeforeAll
  public static void beforeAll(){
    System.out.print("beforeAll Each");

  }

  @AfterAll
  public static void afterAll(){
    System.out.print("beforeAll Each");

  }

  @Test
  void shouldFailWhenReviewContainsSwearWord() {
    String review = "This book is shit";

    System.out.println("Testing a review");
    boolean result = reviewVerifier.doesMeetQualityStandards(review);
    Assertions.assertFalse(result);
  }

  @Test
  void shouldFailWhenReviewContainsSwearWordTwo() {
    String review = "This book is shit";

    System.out.println("Testing a review");
    boolean result = reviewVerifier.doesMeetQualityStandards(review);
    Assertions.assertFalse(result);
  }
}
