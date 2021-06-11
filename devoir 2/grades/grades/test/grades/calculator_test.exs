defmodule Grades.CalculatorTest do
  use ExUnit.Case
  alias Grades.Calculator

  describe "percentage_grade/1" do
    test "test24" do
      assert 85 ==
               Calculator.percentage_grade(%{
                 homework: [0.8],
                 labs: [1, 1, 1],
                 midterm: 0.70,
                 final: 0.9
               })
 
  end
  test "test2" do
    assert 35 ==
             Calculator.percentage_grade(%{
               homework: [],
               labs: [],
               midterm: 0.70,
               final: 0.70
             })
  end

  test "test3" do
    assert "EIN" ==
             Calculator.letter_grade(%{
               homework: [],
               labs: [],
               midterm: 0.70,
               final: 0.70
             })
  end

  test "test4" do
    assert "A+" ==
             Calculator.letter_grade(%{
               homework: [1,1],
               labs: [1, 1, 1],
               midterm: 1,
               final: 1
             })
  end

  test "test5" do
      assert "A" ==
               Calculator.letter_grade(%{
                 homework: [0.85, 0.85],
                 labs: [0.85, 0.85, 0.85],
                 midterm: 0.85,
                 final: 0.85
               })
  end

  test "test6" do
      assert "A-" ==
               Calculator.letter_grade(%{
                 homework: [0.80, 0.80],
                 labs: [0.80, 0.80, 0.80],
                 midterm: 0.80,
                 final: 0.80
               })
  end

  test "test7" do
      assert "B+" ==
               Calculator.letter_grade(%{
                 homework: [0.75, 0.75],
                 labs: [0.75, 0.75, 0.75],
                 midterm: 0.75,
                 final: 0.75
               })
  end


  test "test8" do
    assert "B" ==
             Calculator.letter_grade(%{
               homework: [0.70, 0.70],
               labs: [0.70, 0.70, 0.70],
               midterm: 0.70,
               final: 0.70
             })
  end

  test "test9" do
    assert "C+" ==
             Calculator.letter_grade(%{
               homework: [0.65, 0.65],
               labs: [0.65, 0.65, 0.65],
               midterm: 0.65,
               final: 0.65
             })
  end

    test "test10" do
      assert "C" ==
               Calculator.letter_grade(%{
                 homework: [0.60, 0.60],
                 labs: [0.60, 0.60, 0.60],
                 midterm: 0.60,
                 final: 0.60
               })
    end


    test "test11" do
      assert "D+" ==
               Calculator.letter_grade(%{
                 homework: [0.55, 0.55],
                 labs: [0.55, 0.55, 0.55],
                 midterm: 0.55,
                 final: 0.55
               })
    end

  test "test12" do
    assert "D" ==
             Calculator.letter_grade(%{
               homework: [0.50, 0.50],
               labs: [0.50, 0.50, 0.50],
               midterm: 0.50,
               final: 0.50
             })
  end

  test "test13" do
    assert "E" ==
             Calculator.letter_grade(%{
               homework: [0.48, 0.48],
               labs: [0.48, 0.48, 0.48],
               midterm: 0.48,
               final: 0.48
             })
  end

  test "test14" do
    assert 10 ==
             Calculator.numeric_grade(%{
               homework: [1, 1],
               labs: [1, 1, 1],
               midterm: 1,
               final: 1
             })
  end

  test "test15" do
    assert 9 ==
             Calculator.numeric_grade(%{
               homework: [0.85, 0.85],
               labs: [0.85, 0.85, 0.85],
               midterm: 0.85,
               final: 0.85
             })
  end

  test "test16" do
    assert 8 ==
             Calculator.numeric_grade(%{
               homework: [0.80, 0.80],
               labs: [0.80, 0.80, 0.80],
               midterm: 0.80,
               final: 0.80
             })
  end

  test "test17" do
    assert 7 ==
             Calculator.numeric_grade(%{
               homework: [0.75, 0.75],
               labs: [0.75, 0.75, 0.75],
               midterm: 0.75,
               final: 0.75
             })
  end

    test "test18" do
      assert 6 ==
               Calculator.numeric_grade(%{
                 homework: [0.70, 0.70],
                 labs: [0.70, 0.70, 0.70],
                 midterm: 0.70,
                 final: 0.70
               })
    end

  test "test19" do
    assert 5 ==
             Calculator.numeric_grade(%{
               homework: [0.65, 0.65],
               labs: [0.65, 0.65, 0.65],
               midterm: 0.65,
               final: 0.65
             })
  end


  test "test20" do
    assert 4 ==
             Calculator.numeric_grade(%{
               homework: [0.60, 0.60],
               labs: [0.60, 0.60, 0.60],
               midterm: 0.60,
               final: 0.60
             })
  end

  test "test21" do
    assert 3 ==
             Calculator.numeric_grade(%{
               homework: [0.55, 0.55],
               labs: [0.55, 0.55, 0.55],
               midterm: 0.55,
               final: 0.55
             })
  end

  test "test22" do
    assert 2 ==
             Calculator.numeric_grade(%{
               homework: [0.50, 0.50],
               labs: [0.50, 0.50, 0.50],
               midterm: 0.50,
               final: 0.50
             })
  end

  test "test23" do
    assert 1 ==
             Calculator.numeric_grade(%{
               homework: [0.48, 0.48],
               labs: [0.48, 0.48, 0.48],
               midterm: 0.48,
               final: 0.48
             })
  end

  test "test1" do
    assert 0 ==
             Calculator.numeric_grade(%{
               homework: [0.40, 0.40],
               labs: [0.35, 0.35, 0.35],
               midterm: 0.40,
               final: 0.40
             })
  end

    test "test25" do
      assert 7 ==
               Calculator.numeric_grade(%{
                 homework: [0.75, 0.85],
                 labs: [1, 0.60, 0.90],
                 midterm: 0.70,
                 final: 0.70
               })
    end
end
end
