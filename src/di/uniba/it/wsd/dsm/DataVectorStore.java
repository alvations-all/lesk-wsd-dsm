/**
   Copyright (c) 2014, the LESK-WSD-DSM AUTHORS.

   All rights reserved.

   Redistribution and use in source and binary forms, with or without
   modification, are permitted provided that the following conditions are
   met:

 * Redistributions of source code must retain the above copyright
   notice, this list of conditions and the following disclaimer.

 * Redistributions in binary form must reproduce the above
   copyright notice, this list of conditions and the following
   disclaimer in the documentation and/or other materials provided
   with the distribution.

 * Neither the name of the University of Bari nor the names
   of its contributors may be used to endorse or promote products
   derived from this software without specific prior written
   permission.

   THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
   "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT
   LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR
   A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR
   CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
   EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
   PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR
   PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF
   LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
   NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
   SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
    
   GNU GENERAL PUBLIC LICENSE - Version 3, 29 June 2007
 **/

package di.uniba.it.wsd.dsm;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * This class reads and stores in a Map the word vectors
 * @author pierpaolo
 */
public class DataVectorStore {

    private Map<String, float[]> vectors;

    private int dimension;

    private String vectorType;

    private static final Logger logger = Logger.getLogger(DataVectorStore.class.getName());

    /**
     *
     * @param inputFile
     * @throws IOException
     */
    public void init(File inputFile) throws IOException {
        vectors = new HashMap<>();
        DataInputStream input = new DataInputStream(new BufferedInputStream(new FileInputStream(inputFile)));
        vectorType = input.readUTF();
        dimension = input.readInt();
        int c = 0;
        while (input.available() > 0) {
            String key = input.readUTF();
            float[] v = new float[dimension];
            for (int i = 0; i < dimension; i++) {
                v[i] = input.readFloat();
            }
            vectors.put(key, v);
            c++;
            if (c % 10000 == 0) {
                System.out.print(c + " ");
            }
        }
        input.close();
        logger.log(Level.INFO, "Loaded {0} vectors.", vectors.size());
    }

    /**
     *
     * @param key
     * @return
     */
    public float[] getVector(String key) {
        return vectors.get(key);
    }

    /**
     *
     * @return
     */
    public int getDimension() {
        return dimension;
    }

    /**
     *
     * @param dimension
     */
    public void setDimension(int dimension) {
        this.dimension = dimension;
    }

    /**
     *
     * @return
     */
    public String getVectorType() {
        return vectorType;
    }

    /**
     *
     * @param vectorType
     */
    public void setVectorType(String vectorType) {
        this.vectorType = vectorType;
    }

}
