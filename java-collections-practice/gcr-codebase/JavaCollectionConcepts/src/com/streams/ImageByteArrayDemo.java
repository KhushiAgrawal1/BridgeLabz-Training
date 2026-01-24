package com.streams;

import java.io.*;

public class ImageByteArrayDemo {

    public static void main(String[] args) {

        String sourceImage = "input.jpg";   // original image
        String outputImage = "output.jpg";  // recreated image

        try {
            // -------- Read image into byte array --------
            FileInputStream fis = new FileInputStream(sourceImage);
            ByteArrayOutputStream baos = new ByteArrayOutputStream();

            byte[] buffer = new byte[4096]; // 4 KB buffer
            int bytesRead;

            while ((bytesRead = fis.read(buffer)) != -1) {
                baos.write(buffer, 0, bytesRead);
            }

            byte[] imageBytes = baos.toByteArray(); // image as byte array

            fis.close();
            baos.close();

            System.out.println("Image converted to byte array successfully!");

            // -------- Write byte array back to image --------
            ByteArrayInputStream bais = new ByteArrayInputStream(imageBytes);
            FileOutputStream fos = new FileOutputStream(outputImage);

            while ((bytesRead = bais.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }

            bais.close();
            fos.close();

            System.out.println("New image file created successfully!");

            // -------- Verification --------
            if (new File(sourceImage).length() == new File(outputImage).length()) {
                System.out.println("Verification Passed: Files are identical in size ✅");
            } else {
                System.out.println("Verification Failed: Files are different ❌");
            }

        } catch (IOException e) {
            System.out.println("IO Error: " + e.getMessage());
        }
    }
}

