/**
 * Copyright (c) 2014, the LESK-WSD-DSM AUTHORS.
 *
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * Redistributions of source code must retain the above copyright notice, this
 * list of conditions and the following disclaimer.
 *
 * Redistributions in binary form must reproduce the above copyright notice,
 * this list of conditions and the following disclaimer in the documentation
 * and/or other materials provided with the distribution.
 *
 * Neither the name of the University of Bari nor the names of its contributors
 * may be used to endorse or promote products derived from this software without
 * specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 *
 * GNU GENERAL PUBLIC LICENSE - Version 3, 29 June 2007
 *
 */
package di.uniba.it.wsd.data;

/**
 * Container for storing some statistics about the execution
 * @author Pierpaolo Basile pierpaolo.basile@gmail.com
 */
public class ExecuteStatistics {

    private int noGloss = 0;

    private int missSV = 0;

    private int totalSVhit = 0;

    private int totalGloss = 0;

    /**
     *
     * @return
     */
    public int getNoGloss() {
        return noGloss;
    }

    /**
     *
     * @param noGloss
     */
    public void setNoGloss(int noGloss) {
        this.noGloss = noGloss;
    }

    /**
     *
     */
    public void incrementNoGloss() {
        this.noGloss++;
    }

    /**
     *
     * @return
     */
    public int getMissSV() {
        return missSV;
    }

    /**
     *
     * @param missSV
     */
    public void setMissSV(int missSV) {
        this.missSV = missSV;
    }

    /**
     *
     */
    public void incrementMissSV() {
        this.missSV++;
    }

    /**
     *
     * @return
     */
    public int getTotalSVhit() {
        return totalSVhit;
    }

    /**
     *
     * @param totalSVhit
     */
    public void setTotalSVhit(int totalSVhit) {
        this.totalSVhit = totalSVhit;
    }

    /**
     *
     */
    public void incrementTotalSVhit() {
        this.totalSVhit++;
    }

    /**
     *
     * @return
     */
    public int getTotalGloss() {
        return totalGloss;
    }

    /**
     *
     * @param totalGloss
     */
    public void setTotalGloss(int totalGloss) {
        this.totalGloss = totalGloss;
    }

    /**
     *
     */
    public void incrementTotalGloss() {
        this.totalGloss++;
    }

    @Override
    public String toString() {
        return "ExecuteStatistics{" + "noGloss=" + noGloss + ", missSV=" + missSV + ", totalSVhit=" + totalSVhit + ", totalGloss=" + totalGloss + '}';
    }

}
