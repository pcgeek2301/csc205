public class DLLWithOutputTester_Minilab_6_DLL
{
	public static void main(String[ ] args)
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		String test = kb.nextLine();
		System.out.println(test + "\n");

		//===============================================
		if (test.equalsIgnoreCase("Testing addLast") ||
			test.equalsIgnoreCase("Testing all"))
		{
			{
				System.out.println("\nTesting addLast(9) with empty DLListWithOutput:");
				DLListWithOutput<Integer> myDLL = null;
				try
				{
					myDLL = generateDLL( new int[ ] {  } );
					System.out.println("toString before:  " + myDLL);
					System.out.println("backwards before: " + myDLL.backwards());

					myDLL.addLast(9);
				}
				catch(Throwable ex)
				{
					System.out.println(ex.getClass().getName());
					//ex.printStackTrace();
				}
				finally
				{
					System.out.println("toString after:   " + myDLL);
					System.out.println("backwards after:  " + myDLL.backwards());
				}
			}
			//---------------------------------------------------------------------------
			{
				System.out.println("\nTesting addLast(8) with one-element DLListWithOutput:");
				DLListWithOutput<Integer> myDLL = null;
				try
				{
					myDLL = generateDLL( new int[ ] { 6 } );
					System.out.println("toString before:  " + myDLL);
					System.out.println("backwards before: " + myDLL.backwards());
					myDLL.addLast(8);
				}
				catch(Throwable ex)
				{
					System.out.println(ex.getClass().getName());
					//ex.printStackTrace();
				}
				finally
				{
					System.out.println("toString after:   " + myDLL);
					System.out.println("backwards after:  " + myDLL.backwards());
				}
			}
			//---------------------------------------------------------------------------
			{
				System.out.println("\nTesting addLast(99) with many-element DLListWithOutput:");
				DLListWithOutput<Integer> myDLL = null;
				try
				{
					myDLL = generateDLL( new int[ ] { 3, 4, 5, 6, 7, 8 } );
					System.out.println("toString before:  " + myDLL);
					System.out.println("backwards before: " + myDLL.backwards());
					myDLL.addLast(99);
				}
				catch(Throwable ex)
				{
					System.out.println(ex.getClass().getName());
					//ex.printStackTrace();
				}
				finally
				{
					System.out.println("toString after:   " + myDLL);
					System.out.println("backwards after:  " + myDLL.backwards());
				}
			}
		}

		//===============================================

		if (test.equalsIgnoreCase("Testing addFirst") ||
			test.equalsIgnoreCase("Testing all"))
		{
			{
				System.out.println("\nTesting addFirst(0) with empty DLListWithOutput:");
				DLListWithOutput<Integer> myDLL = null;
				try
				{
					myDLL = generateDLL( new int[ ] {  } );
					System.out.println("toString before:  " + myDLL);
					System.out.println("backwards before: " + myDLL.backwards());

					myDLL.addFirst(0);
				}
				catch(Throwable ex)
				{
					System.out.println(ex.getClass().getName());
					//ex.printStackTrace();
				}
				finally
				{
					System.out.println("toString after:   " + myDLL);
					System.out.println("backwards after:  " + myDLL.backwards());
				}
			}
			//---------------------------------------------------------------------------
			{
				System.out.println("\nTesting addFirst(0) with one-element DLListWithOutput:");
				DLListWithOutput<Integer> myDLL = null;
				try
				{
					myDLL = generateDLL( new int[ ] { 6 } );
					System.out.println("toString before:  " + myDLL);
					System.out.println("backwards before: " + myDLL.backwards());
					myDLL.addFirst(0);
				}
				catch(Throwable ex)
				{
					System.out.println(ex.getClass().getName());
					//ex.printStackTrace();
				}
				finally
				{
					System.out.println("toString after:   " + myDLL);
					System.out.println("backwards after:  " + myDLL.backwards());
				}
			}
			//---------------------------------------------------------------------------
			{
				System.out.println("\nTesting addFirst(0) with many-element DLListWithOutput:");
				DLListWithOutput<Integer> myDLL = null;
				try
				{
					myDLL = generateDLL( new int[ ] { 3, 4, 5, 6, 7, 8 } );
					System.out.println("toString before:  " + myDLL);
					System.out.println("backwards before: " + myDLL.backwards());
					myDLL.addFirst(0);
				}
				catch(Throwable ex)
				{
					System.out.println(ex.getClass().getName());
					//ex.printStackTrace();
				}
				finally
				{
					System.out.println("toString after:   " + myDLL);
					System.out.println("backwards after:  " + myDLL.backwards());
				}
			}
		}

		//===============================================

		if (test.equalsIgnoreCase("Testing getFirst")||
			test.equalsIgnoreCase("Testing all"))
		{
			{
				System.out.println("\nTesting getFirst() with empty DLListWithOutput:");
				DLListWithOutput<Integer> myDLL = null;
				try
				{
					myDLL = generateDLL( new int[ ] {  } );
					System.out.println("toString before:  " + myDLL);
					System.out.println("backwards before: " + myDLL.backwards());
					int elt = myDLL.getFirst();
					System.out.println("returned: " + elt);
				}
				catch(Throwable ex)
				{
					System.out.println(ex.getClass().getName());
					//ex.printStackTrace();
				}
				finally
				{
					System.out.println("toString after:   " + myDLL);
					System.out.println("backwards after:  " + myDLL.backwards());
				}
			}
			//---------------------------------------------------------------------------
			{
				System.out.println("\nTesting getFirst() with one-element DLListWithOutput:");
				DLListWithOutput<Integer> myDLL = null;
				try
				{
					myDLL = generateDLL( new int[ ] { 6 } );
					System.out.println("toString before:  " + myDLL);
					System.out.println("backwards before: " + myDLL.backwards());
					int elt = myDLL.getFirst();
					System.out.println("returned: " + elt);
				}
				catch(Throwable ex)
				{
					System.out.println(ex.getClass().getName());
					//ex.printStackTrace();
				}
				finally
				{
					System.out.println("toString after:   " + myDLL);
					System.out.println("backwards after:  " + myDLL.backwards());
				}
			}
			//---------------------------------------------------------------------------
			{
				System.out.println("\nTesting getFirst() with many-element DLListWithOutput:");
				DLListWithOutput<Integer> myDLL = null;
				try
				{
					myDLL = generateDLL( new int[ ] { 3, 4, 5, 6, 7, 8 } );
					System.out.println("toString before:  " + myDLL);
					System.out.println("backwards before: " + myDLL.backwards());
					int elt = myDLL.getFirst();
					System.out.println("returned: " + elt);
				}
				catch(Throwable ex)
				{
					System.out.println(ex.getClass().getName());
					//ex.printStackTrace();
				}
				finally
				{
					System.out.println("toString after:   " + myDLL);
					System.out.println("backwards after:  " + myDLL.backwards());
				}
			}
		}

		//===============================================

		if (test.equalsIgnoreCase("Testing getLast")||
			test.equalsIgnoreCase("Testing all"))
		{
			{
				System.out.println("\nTesting getLast() with empty DLListWithOutput:");
				DLListWithOutput<Integer> myDLL = null;
				try
				{
					myDLL = generateDLL( new int[ ] {  } );
					System.out.println("toString before:  " + myDLL);
					System.out.println("backwards before: " + myDLL.backwards());
					int elt = myDLL.getLast();
					System.out.println("returned: " + elt);
				}
				catch(Throwable ex)
				{
					System.out.println(ex.getClass().getName());
					//ex.printStackTrace();
				}
				finally
				{
					System.out.println("toString after:   " + myDLL);
					System.out.println("backwards after:  " + myDLL.backwards());
				}
			}
			//---------------------------------------------------------------------------
			{
				System.out.println("\nTesting getLast() with one-element DLListWithOutput:");
				DLListWithOutput<Integer> myDLL = null;
				try
				{
					myDLL = generateDLL( new int[ ] { 6 } );
					System.out.println("toString before:  " + myDLL);
					System.out.println("backwards before: " + myDLL.backwards());
					int elt = myDLL.getLast();
					System.out.println("returned: " + elt);
				}
				catch(Throwable ex)
				{
					System.out.println(ex.getClass().getName());
					//ex.printStackTrace();
				}
				finally
				{
					System.out.println("toString after:   " + myDLL);
					System.out.println("backwards after:  " + myDLL.backwards());
				}
			}
			//---------------------------------------------------------------------------
			{
				System.out.println("\nTesting getLast() with many-element DLListWithOutput:");
				DLListWithOutput<Integer> myDLL = null;
				try
				{
					myDLL = generateDLL( new int[ ] { 3, 4, 5, 6, 7, 8 } );
					System.out.println("toString before:  " + myDLL);
					System.out.println("backwards before: " + myDLL.backwards());
					int elt = myDLL.getLast();
					System.out.println("returned: " + elt);
				}
				catch(Throwable ex)
				{
					System.out.println(ex.getClass().getName());
					//ex.printStackTrace();
				}
				finally
				{
					System.out.println("toString after:   " + myDLL);
					System.out.println("backwards after:  " + myDLL.backwards());
				}
			}
		}

		//===============================================

		if (test.equalsIgnoreCase("Testing removeFirst")||
			test.equalsIgnoreCase("Testing all"))
		{
			{
				System.out.println("\nTesting removeFirst() with empty DLListWithOutput:");
				DLListWithOutput<Integer> myDLL = null;
				try
				{
					myDLL = generateDLL( new int[ ] {  } );
					System.out.println("toString before:  " + myDLL);
					System.out.println("backwards before: " + myDLL.backwards());
					int elt = myDLL.removeFirst();
					System.out.println("returned: " + elt);
				}
				catch(Throwable ex)
				{
					System.out.println(ex.getClass().getName());
					//ex.printStackTrace();
				}
				finally
				{
					System.out.println("toString after:   " + myDLL);
					System.out.println("backwards after:  " + myDLL.backwards());
				}
			}
			//---------------------------------------------------------------------------
			{
				System.out.println("\nTesting removeFirst() with one-element DLListWithOutput:");
				DLListWithOutput<Integer> myDLL = null;
				try
				{
					myDLL = generateDLL( new int[ ] { 6 } );
					System.out.println("toString before:  " + myDLL);
					System.out.println("backwards before: " + myDLL.backwards());
					int elt = myDLL.removeFirst();
					System.out.println("returned: " + elt);
				}
				catch(Throwable ex)
				{
					System.out.println(ex.getClass().getName());
					//ex.printStackTrace();
				}
				finally
				{
					System.out.println("toString after:   " + myDLL);
					System.out.println("backwards after:  " + myDLL.backwards());
				}
			}
			//---------------------------------------------------------------------------
			{
				System.out.println("\nTesting removeFirst() with many-element DLListWithOutput:");
				DLListWithOutput<Integer> myDLL = null;
				try
				{
					myDLL = generateDLL( new int[ ] { 3, 4, 5, 6, 7, 8 } );
					System.out.println("toString before:  " + myDLL);
					System.out.println("backwards before: " + myDLL.backwards());
					int elt = myDLL.removeFirst();
					System.out.println("returned: " + elt);
				}
				catch(Throwable ex)
				{
					System.out.println(ex.getClass().getName());
					//ex.printStackTrace();
				}
				finally
				{
					System.out.println("toString after:   " + myDLL);
					System.out.println("backwards after:  " + myDLL.backwards());
				}
			}
		}

		//===============================================

		if (test.equalsIgnoreCase("Testing removeLast")||
			test.equalsIgnoreCase("Testing all"))
		{
			{
				System.out.println("\nTesting removeLast() with empty DLListWithOutput:");
				DLListWithOutput<Integer> myDLL = null;
				try
				{
					myDLL = generateDLL( new int[ ] {  } );
					System.out.println("toString before:  " + myDLL);
					System.out.println("backwards before: " + myDLL.backwards());
					int elt = myDLL.removeLast();
					System.out.println("returned: " + elt);
				}
				catch(Throwable ex)
				{
					System.out.println(ex.getClass().getName());
					//ex.printStackTrace();
				}
				finally
				{
					System.out.println("toString after:   " + myDLL);
					System.out.println("backwards after:  " + myDLL.backwards());
				}
			}
			//---------------------------------------------------------------------------
			{
				System.out.println("\nTesting removeLast() with one-element DLListWithOutput:");
				DLListWithOutput<Integer> myDLL = null;
				try
				{
					myDLL = generateDLL( new int[ ] { 6 } );
					System.out.println("toString before:  " + myDLL);
					System.out.println("backwards before: " + myDLL.backwards());
					int elt = myDLL.removeLast();
					System.out.println("returned: " + elt);
				}
				catch(Throwable ex)
				{
					System.out.println(ex.getClass().getName());
					//ex.printStackTrace();
				}
				finally
				{
					System.out.println("toString after:   " + myDLL);
					System.out.println("backwards after:  " + myDLL.backwards());
				}
			}
			//---------------------------------------------------------------------------
			{
				System.out.println("\nTesting removeLast() with many-element DLListWithOutput:");
				DLListWithOutput<Integer> myDLL = null;
				try
				{
					myDLL = generateDLL( new int[ ] { 3, 4, 5, 6, 7, 8 } );
					System.out.println("toString before:  " + myDLL);
					System.out.println("backwards before: " + myDLL.backwards());
					int elt = myDLL.removeLast();
					System.out.println("returned: " + elt);
				}
				catch(Throwable ex)
				{
					System.out.println(ex.getClass().getName());
					//ex.printStackTrace();
				}
				finally
				{
					System.out.println("toString after:   " + myDLL);
					System.out.println("backwards after:  " + myDLL.backwards());
				}
			}
		}

		//===============================================

		if (test.equalsIgnoreCase("Testing size")||
			test.equalsIgnoreCase("Testing all"))
		{
			{
				System.out.println("\nTesting size() with empty DLListWithOutput:");
				DLListWithOutput<Integer> myDLL = null;
				try
				{
					myDLL = generateDLL( new int[ ] {  } );
					System.out.println("toString before:  " + myDLL);
					System.out.println("backwards before: " + myDLL.backwards());
					int elt = myDLL.size();
					System.out.println("returned: " + elt);
				}
				catch(Throwable ex)
				{
					System.out.println(ex.getClass().getName());
					//ex.printStackTrace();
				}
				finally
				{
					System.out.println("toString after:   " + myDLL);
					System.out.println("backwards after:  " + myDLL.backwards());
				}
			}
			//---------------------------------------------------------------------------
			{
				System.out.println("\nTesting size() with one-element DLListWithOutput:");
				DLListWithOutput<Integer> myDLL = null;
				try
				{
					myDLL = generateDLL( new int[ ] { 6 } );
					System.out.println("toString before:  " + myDLL);
					System.out.println("backwards before: " + myDLL.backwards());
					int elt = myDLL.size();
					System.out.println("returned: " + elt);
				}
				catch(Throwable ex)
				{
					System.out.println(ex.getClass().getName());
					//ex.printStackTrace();
				}
				finally
				{
					System.out.println("toString after:   " + myDLL);
					System.out.println("backwards after:  " + myDLL.backwards());
				}
			}
			//---------------------------------------------------------------------------
			{
				System.out.println("\nTesting size() with many-element DLListWithOutput:");
				DLListWithOutput<Integer> myDLL = null;
				try
				{
					myDLL = generateDLL( new int[ ] { 3, 4, 5, 6, 7, 8 } );
					System.out.println("toString before:  " + myDLL);
					System.out.println("backwards before: " + myDLL.backwards());
					int elt = myDLL.size();
					System.out.println("returned: " + elt);
				}
				catch(Throwable ex)
				{
					System.out.println(ex.getClass().getName());
					//ex.printStackTrace();
				}
				finally
				{
					System.out.println("toString after:   " + myDLL);
					System.out.println("backwards after:  " + myDLL.backwards());
				}
			}
		}

		//===============================================

		if (test.equalsIgnoreCase("Testing isEmpty")||
			test.equalsIgnoreCase("Testing all"))
		{
			{
				System.out.println("\nTesting isEmpty() with empty DLListWithOutput:");
				DLListWithOutput<Integer> myDLL = null;
				try
				{
					myDLL = generateDLL( new int[ ] {  } );
					System.out.println("toString before:  " + myDLL);
					System.out.println("backwards before: " + myDLL.backwards());
					boolean result = myDLL.isEmpty();
					System.out.println("returned: " + result);
				}
				catch(Throwable ex)
				{
					System.out.println(ex.getClass().getName());
					//ex.printStackTrace();
				}
				finally
				{
					System.out.println("toString after:   " + myDLL);
					System.out.println("backwards after:  " + myDLL.backwards());
				}
			}
			//---------------------------------------------------------------------------
			{
				System.out.println("\nTesting isEmpty() with one-element DLListWithOutput:");
				DLListWithOutput<Integer> myDLL = null;
				try
				{
					myDLL = generateDLL( new int[ ] { 6 } );
					System.out.println("toString before:  " + myDLL);
					System.out.println("backwards before: " + myDLL.backwards());
					boolean result = myDLL.isEmpty();
					System.out.println("returned: " + result);
				}
				catch(Throwable ex)
				{
					System.out.println(ex.getClass().getName());
					//ex.printStackTrace();
				}
				finally
				{
					System.out.println("toString after:   " + myDLL);
					System.out.println("backwards after:  " + myDLL.backwards());
				}
			}
			//---------------------------------------------------------------------------
			{
				System.out.println("\nTesting isEmpty() with many-element DLListWithOutput:");
				DLListWithOutput<Integer> myDLL = null;
				try
				{
					myDLL = generateDLL( new int[ ] { 3, 4, 5, 6, 7, 8 } );
					System.out.println("toString before:  " + myDLL);
					System.out.println("backwards before: " + myDLL.backwards());
					boolean result = myDLL.isEmpty();
					System.out.println("returned: " + result);
				}
				catch(Throwable ex)
				{
					System.out.println(ex.getClass().getName());
					//ex.printStackTrace();
				}
				finally
				{
					System.out.println("toString after:   " + myDLL);
					System.out.println("backwards after:  " + myDLL.backwards());
				}
			}
		}

		//===============================================

		if (test.equalsIgnoreCase("Testing contains")||
			test.equalsIgnoreCase("Testing all"))
		{
			{
				System.out.println("\nTesting contains(4) with empty DLListWithOutput:");
				DLListWithOutput<Integer> myDLL = null;
				try
				{
					myDLL = generateDLL( new int[ ] {  } );
					System.out.println("toString before:  " + myDLL);
					System.out.println("backwards before: " + myDLL.backwards());
					boolean result = myDLL.contains(4);
					System.out.println("returned: " + result);
				}
				catch(Throwable ex)
				{
					System.out.println(ex.getClass().getName());
					//ex.printStackTrace();
				}
				finally
				{
					System.out.println("toString after:   " + myDLL);
					System.out.println("backwards after:  " + myDLL.backwards());
				}
			}
			//---------------------------------------------------------------------------
			{
				System.out.println("\nTesting contains(6) with one-element DLListWithOutput that contains it:");
				DLListWithOutput<Integer> myDLL = null;
				try
				{
					myDLL = generateDLL( new int[ ] { 6 } );
					System.out.println("toString before:  " + myDLL);
					System.out.println("backwards before: " + myDLL.backwards());
					boolean result = myDLL.contains(6);
					System.out.println("returned: " + result);
				}
				catch(Throwable ex)
				{
					System.out.println(ex.getClass().getName());
					//ex.printStackTrace();
				}
				finally
				{
					System.out.println("toString after:   " + myDLL);
					System.out.println("backwards after:  " + myDLL.backwards());
				}
			}
			//---------------------------------------------------------------------------
			{
				System.out.println("\nTesting contains(6) with one-element DLListWithOutput that does NOT contain it:");
				DLListWithOutput<Integer> myDLL = null;
				try
				{
					myDLL = generateDLL( new int[ ] { 3 } );
					System.out.println("toString before:  " + myDLL);
					System.out.println("backwards before: " + myDLL.backwards());
					boolean result = myDLL.contains(6);
					System.out.println("returned: " + result);
				}
				catch(Throwable ex)
				{
					System.out.println(ex.getClass().getName());
					//ex.printStackTrace();
				}
				finally
				{
					System.out.println("toString after:   " + myDLL);
					System.out.println("backwards after:  " + myDLL.backwards());
				}
			}
			//---------------------------------------------------------------------------
			{
				System.out.println("\nTesting contains(3) with many-element DLListWithOutput that contains it first:");
				DLListWithOutput<Integer> myDLL = null;
				try
				{
					myDLL = generateDLL( new int[ ] { 3, 4, 5, 6, 7, 8 } );
					System.out.println("toString before:  " + myDLL);
					System.out.println("backwards before: " + myDLL.backwards());
					boolean result = myDLL.contains(3);
					System.out.println("returned: " + result);
				}
				catch(Throwable ex)
				{
					System.out.println(ex.getClass().getName());
					//ex.printStackTrace();
				}
				finally
				{
					System.out.println("toString after:   " + myDLL);
					System.out.println("backwards after:  " + myDLL.backwards());
				}
			}
			//---------------------------------------------------------------------------
			{
				System.out.println("\nTesting contains(5) with many-element DLListWithOutput that contains it in the middle:");
				DLListWithOutput<Integer> myDLL = null;
				try
				{
					myDLL = generateDLL( new int[ ] { 3, 4, 5, 6, 7, 8 } );
					System.out.println("toString before:  " + myDLL);
					System.out.println("backwards before: " + myDLL.backwards());
					boolean result = myDLL.contains(5);
					System.out.println("returned: " + result);
				}
				catch(Throwable ex)
				{
					System.out.println(ex.getClass().getName());
					//ex.printStackTrace();
				}
				finally
				{
					System.out.println("toString after:   " + myDLL);
					System.out.println("backwards after:  " + myDLL.backwards());
				}
			}
			//---------------------------------------------------------------------------
			{
				System.out.println("\nTesting contains(8) with many-element DLListWithOutput that contains it last:");
				DLListWithOutput<Integer> myDLL = null;
				try
				{
					myDLL = generateDLL( new int[ ] { 3, 4, 5, 6, 7, 8 } );
					System.out.println("toString before:  " + myDLL);
					System.out.println("backwards before: " + myDLL.backwards());
					boolean result = myDLL.contains(8);
					System.out.println("returned: " + result);
				}
				catch(Throwable ex)
				{
					System.out.println(ex.getClass().getName());
					//ex.printStackTrace();
				}
				finally
				{
					System.out.println("toString after:   " + myDLL);
					System.out.println("backwards after:  " + myDLL.backwards());
				}
			}
			//---------------------------------------------------------------------------
			{
				System.out.println("\nTesting contains(99) with many-element DLListWithOutput that does NOT contain it:");
				DLListWithOutput<Integer> myDLL = null;
				try
				{
					myDLL = generateDLL( new int[ ] { 3, 4, 5, 6, 7, 8 } );
					System.out.println("toString before:  " + myDLL);
					System.out.println("backwards before: " + myDLL.backwards());
					boolean result = myDLL.contains(99);
					System.out.println("returned: " + result);
				}
				catch(Throwable ex)
				{
					System.out.println(ex.getClass().getName());
					//ex.printStackTrace();
				}
				finally
				{
					System.out.println("toString after:   " + myDLL);
					System.out.println("backwards after:  " + myDLL.backwards());
				}
			}
		}

		//===============================================

		if (test.equalsIgnoreCase("Testing add")||
			test.equalsIgnoreCase("Testing all"))
		{
			{
				System.out.println("\nTesting add(-1, 4):");
				DLListWithOutput<Integer> myDLL = null;
				try
				{
					myDLL = generateDLL( new int[ ] { 3, 5, 7, 9, 11, 13 } );
					System.out.println("toString before:  " + myDLL);
					System.out.println("backwards before: " + myDLL.backwards());
					myDLL.add(-1, 4);
				}
				catch(Throwable ex)
				{
					System.out.println(ex.getClass().getName());
					//ex.printStackTrace();
				}
				finally
				{
					System.out.println("toString after:   " + myDLL);
					System.out.println("backwards after:  " + myDLL.backwards());
				}
			}
			//---------------------------------------------------------------------------
			{
				System.out.println("\nTesting add(0, 4) with empty DLListWithOutput:");
				DLListWithOutput<Integer> myDLL = null;
				try
				{
					myDLL = generateDLL( new int[ ] {  } );
					System.out.println("toString before:  " + myDLL);
					System.out.println("backwards before: " + myDLL.backwards());
					myDLL.add(0, 4);
				}
				catch(Throwable ex)
				{
					System.out.println(ex.getClass().getName());
					//ex.printStackTrace();
				}
				finally
				{
					System.out.println("toString after:   " + myDLL);
					System.out.println("backwards after:  " + myDLL.backwards());
				}
			}
			//---------------------------------------------------------------------------
			{
				System.out.println("\nTesting add(1, 4) with empty DLListWithOutput:");
				DLListWithOutput<Integer> myDLL = null;
				try
				{
					myDLL = generateDLL( new int[ ] {  } );
					System.out.println("toString before:  " + myDLL);
					System.out.println("backwards before: " + myDLL.backwards());
					myDLL.add(1, 4);
				}
				catch(Throwable ex)
				{
					System.out.println(ex.getClass().getName());
					//ex.printStackTrace();
				}
				finally
				{
					System.out.println("toString after:   " + myDLL);
					System.out.println("backwards after:  " + myDLL.backwards());
				}
			}
			//---------------------------------------------------------------------------
			{
				System.out.println("\nTesting add(0, 1) with one-element DLListWithOutput:");
				DLListWithOutput<Integer> myDLL = null;
				try
				{
					myDLL = generateDLL( new int[ ] { 3 } );
					System.out.println("toString before:  " + myDLL);
					System.out.println("backwards before: " + myDLL.backwards());
					myDLL.add(0, 1);
				}
				catch(Throwable ex)
				{
					System.out.println(ex.getClass().getName());
					//ex.printStackTrace();
				}
				finally
				{
					System.out.println("toString after:   " + myDLL);
					System.out.println("backwards after:  " + myDLL.backwards());
				}
			}
			//---------------------------------------------------------------------------
			{
				System.out.println("\nTesting add(1, 5) with one-element DLListWithOutput:");
				DLListWithOutput<Integer> myDLL = null;
				try
				{
					myDLL = generateDLL( new int[ ] { 3 } );
					System.out.println("toString before:  " + myDLL);
					System.out.println("backwards before: " + myDLL.backwards());
					myDLL.add(1, 5);
				}
				catch(Throwable ex)
				{
					System.out.println(ex.getClass().getName());
					//ex.printStackTrace();
				}
				finally
				{
					System.out.println("toString after:   " + myDLL);
					System.out.println("backwards after:  " + myDLL.backwards());
				}
			}
			//---------------------------------------------------------------------------
			{
				System.out.println("\nTesting add(2, 5) with one-element DLListWithOutput:");
				DLListWithOutput<Integer> myDLL = null;
				try
				{
					myDLL = generateDLL( new int[ ] { 3 } );
					System.out.println("toString before:  " + myDLL);
					System.out.println("backwards before: " + myDLL.backwards());
					myDLL.add(2, 5);
				}
				catch(Throwable ex)
				{
					System.out.println(ex.getClass().getName());
					//ex.printStackTrace();
				}
				finally
				{
					System.out.println("toString after:   " + myDLL);
					System.out.println("backwards after:  " + myDLL.backwards());
				}
			}
			//---------------------------------------------------------------------------
			{
				System.out.println("\nTesting add(0, 1) with many-element DLListWithOutput:");
				DLListWithOutput<Integer> myDLL = null;
				try
				{
					myDLL = generateDLL( new int[ ] { 3, 5, 7, 9, 11, 13 } );
					System.out.println("toString before:  " + myDLL);
					System.out.println("backwards before: " + myDLL.backwards());
					myDLL.add(0, 1);
				}
				catch(Throwable ex)
				{
					System.out.println(ex.getClass().getName());
					//ex.printStackTrace();
				}
				finally
				{
					System.out.println("toString after:   " + myDLL);
					System.out.println("backwards after:  " + myDLL.backwards());
				}
			}
			//---------------------------------------------------------------------------
			{
				System.out.println("\nTesting add(1, 4) with many-element DLListWithOutput:");
				DLListWithOutput<Integer> myDLL = null;
				try
				{
					myDLL = generateDLL( new int[ ] { 3, 5, 7, 9, 11, 13 } );
					System.out.println("toString before:  " + myDLL);
					System.out.println("backwards before: " + myDLL.backwards());
					myDLL.add(1, 4);
				}
				catch(Throwable ex)
				{
					System.out.println(ex.getClass().getName());
					//ex.printStackTrace();
				}
				finally
				{
					System.out.println("toString after:   " + myDLL);
					System.out.println("backwards after:  " + myDLL.backwards());
				}
			}
			//---------------------------------------------------------------------------
			{
				System.out.println("\nTesting add(3, 8) with many-element DLListWithOutput:");
				DLListWithOutput<Integer> myDLL = null;
				try
				{
					myDLL = generateDLL( new int[ ] { 3, 5, 7, 9, 11, 13 } );
					System.out.println("toString before:  " + myDLL);
					System.out.println("backwards before: " + myDLL.backwards());
					myDLL.add(3, 8);
				}
				catch(Throwable ex)
				{
					System.out.println(ex.getClass().getName());
					//ex.printStackTrace();
				}
				finally
				{
					System.out.println("toString after:   " + myDLL);
					System.out.println("backwards after:  " + myDLL.backwards());
				}
			}
			//---------------------------------------------------------------------------
			{
				System.out.println("\nTesting add(6, 15) with many-element DLListWithOutput:");
				DLListWithOutput<Integer> myDLL = null;
				try
				{
					myDLL = generateDLL( new int[ ] { 3, 5, 7, 9, 11, 13 } );
					System.out.println("toString before:  " + myDLL);
					System.out.println("backwards before: " + myDLL.backwards());
					myDLL.add(6, 15);
				}
				catch(Throwable ex)
				{
					System.out.println(ex.getClass().getName());
					//ex.printStackTrace();
				}
				finally
				{
					System.out.println("toString after:   " + myDLL);
					System.out.println("backwards after:  " + myDLL.backwards());
				}
			}
			//---------------------------------------------------------------------------
			{
				System.out.println("\nTesting add(7, 15) with many-element DLListWithOutput:");
				DLListWithOutput<Integer> myDLL = null;
				try
				{
					myDLL = generateDLL( new int[ ] { 3, 5, 7, 9, 11, 13 } );
					System.out.println("toString before:  " + myDLL);
					System.out.println("backwards before: " + myDLL.backwards());
					myDLL.add(7, 15);
				}
				catch(Throwable ex)
				{
					System.out.println(ex.getClass().getName());
					//ex.printStackTrace();
				}
				finally
				{
					System.out.println("toString after:   " + myDLL);
					System.out.println("backwards after:  " + myDLL.backwards());
				}
			}
		}
		//===============================================

		if (test.equalsIgnoreCase("Testing remove")||
			test.equalsIgnoreCase("Testing all"))
		{
			{
				System.out.println("\nTesting remove(2) from empty list:");
				DLListWithOutput<Integer> myDLL = null;
				try
				{
					myDLL = generateDLL( new int[ ] {  } );
					System.out.println("toString before:  " + myDLL);
					System.out.println("backwards before: " + myDLL.backwards());
					boolean boolResult = myDLL.remove(2);
					System.out.println("returned: " + boolResult);
				}
				catch(Throwable ex)
				{
					System.out.println(ex.getClass().getName());
					//ex.printStackTrace();
				}
				finally
				{
					System.out.println("toString after:   " + myDLL);
					System.out.println("backwards after:  " + myDLL.backwards());
				}
			}
			//---------------------------------------------------------------------------
			{
				System.out.println("\nTesting remove(2) from one-element list that contains it:");
				DLListWithOutput<Integer> myDLL = null;
				try
				{
					myDLL = generateDLL( new int[ ] { 2 } );
					System.out.println("toString before:  " + myDLL);
					System.out.println("backwards before: " + myDLL.backwards());
					boolean boolResult = myDLL.remove(2);
					System.out.println("returned: " + boolResult);
				}
				catch(Throwable ex)
				{
					System.out.println(ex.getClass().getName());
					//ex.printStackTrace();
				}
				finally
				{
					System.out.println("toString after:   " + myDLL);
					System.out.println("backwards after:  " + myDLL.backwards());
				}
			}
			//---------------------------------------------------------------------------
			{
				System.out.println("\nTesting remove(2) from one-element list that does NOT contain it:");
				DLListWithOutput<Integer> myDLL = null;
				try
				{
					myDLL = generateDLL( new int[ ] { 5 } );
					System.out.println("toString before:  " + myDLL);
					System.out.println("backwards before: " + myDLL.backwards());
					boolean boolResult = myDLL.remove(2);
					System.out.println("returned: " + boolResult);
				}
				catch(Throwable ex)
				{
					System.out.println(ex.getClass().getName());
					//ex.printStackTrace();
				}
				finally
				{
					System.out.println("toString after:   " + myDLL);
					System.out.println("backwards after:  " + myDLL.backwards());
				}
			}
			//---------------------------------------------------------------------------
			{
				System.out.println("\nTesting remove(3) from many-element list that contains it at front (and back):");
				DLListWithOutput<Integer> myDLL = null;
				try

				{
					myDLL = generateDLL( new int[ ] { 3, 5, 7, 9, 11, 3 } );
					System.out.println("toString before:  " + myDLL);
					System.out.println("backwards before: " + myDLL.backwards());
					boolean boolResult = myDLL.remove(3);
					System.out.println("returned: " + boolResult);
				}
				catch(Throwable ex)
				{
					System.out.println(ex.getClass().getName());
					//ex.printStackTrace();
				}
				finally
				{
					System.out.println("toString after:   " + myDLL);
					System.out.println("backwards after:  " + myDLL.backwards());
				}
			}
			//---------------------------------------------------------------------------
			{
				System.out.println("\nTesting remove(7) from many-element list that contains it in middle (and back):");
				DLListWithOutput<Integer> myDLL = null;
				try
				{
					myDLL = generateDLL( new int[ ] { 3, 5, 7, 9, 11, 7 } );
					System.out.println("toString before:  " + myDLL);
					System.out.println("backwards before: " + myDLL.backwards());
					boolean boolResult = myDLL.remove(7);
					System.out.println("returned: " + boolResult);
				}
				catch(Throwable ex)
				{
					System.out.println(ex.getClass().getName());
					//ex.printStackTrace();
				}
				finally
				{
					System.out.println("toString after:   " + myDLL);
					System.out.println("backwards after:  " + myDLL.backwards());
				}
			}
			//---------------------------------------------------------------------------
			{
				System.out.println("\nTesting remove(13) from many-element list that contains it at back:");
				DLListWithOutput<Integer> myDLL = null;
				try
				{
					myDLL = generateDLL( new int[ ] { 3, 5, 7, 9, 11, 13 } );
					System.out.println("toString before:  " + myDLL);
					System.out.println("backwards before: " + myDLL.backwards());
					boolean boolResult = myDLL.remove(13);
					System.out.println("returned: " + boolResult);
				}
				catch(Throwable ex)
				{
					System.out.println(ex.getClass().getName());
					ex.printStackTrace();
				}
				finally
				{
					System.out.println("toString after:   " + myDLL);
					System.out.println("backwards after:  " + myDLL.backwards());
				}
			}
			//---------------------------------------------------------------------------
			{
				System.out.println("\nTesting remove(99) from many-element list that does NOT contain it:");
				DLListWithOutput<Integer> myDLL = null;
				try
				{
					myDLL = generateDLL( new int[ ] { 3, 5, 7, 9, 11, 13 } );
					System.out.println("toString before:  " + myDLL);
					System.out.println("backwards before: " + myDLL.backwards());
					boolean boolResult = myDLL.remove(99);
					System.out.println("returned: " + boolResult);
				}
				catch(Throwable ex)
				{
					System.out.println(ex.getClass().getName());
					//ex.printStackTrace();
				}
				finally
				{
					System.out.println("toString after:   " + myDLL);
					System.out.println("backwards after:  " + myDLL.backwards());
				}
			}
		}

	}

	//=================
	static DLListWithOutput<Integer> generateDLL(int[ ] elements)
	{
		DLListWithOutput<Integer> theDLL = new DLListWithOutput<Integer>();
		for (int i=0; i<elements.length; i++)
			theDLL.addLast(elements[i]);

		return theDLL;
	}
}
