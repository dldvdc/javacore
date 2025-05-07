package com.spacex.discover;

public class TonnageExceededException extends RuntimeException {

    public int tonnageExceeded;

    public TonnageExceededException(int tonnageExceeded ) {

      super("The cargo can't be load because of an exceed of tonnage : " + tonnageExceeded + " tons.");

    }


}
