import { S3Client, GetBucketPolicyCommand, DeleteObjectsCommand, DeleteObjectCommand, DeleteBucketPolicyCommand, CopyObjectCommand, PutBucketPolicyCommand, CreateBucketCommand, ListObjectsV2Command, PutObjectCommand, DeleteBucketCommand, ListBucketsCommand, PutBucketCorsCommand } from '@aws-sdk/client-s3';
// import { fromCognitoIdentityPool } from '@aws-sdk/credential-provider-cognito-identity';

// const client = new S3Client({
//   region: 'us-east-1', // Replace with your AWS region
//   credentials: fromCognitoIdentityPool({
//     // Replace with your Cognito Identity Pool ID
//     identityPoolId: 'eu-north-1:f593dddc-aa99-4d15-bcdd-04018b2f349a',
//   }),
// });

import multer from 'multer';
import express from 'express';
const upload = multer({ storage: multer.memoryStorage() });
const client = new S3Client({
  region:'eu-north-1'
});
const app = express();
const PORT = '4000';
app.get('/',(req,res) => {
  res.sendFile("/Users/ranjitha-18338/aws-s3/js/index.html");
});
app.post('/upload', upload.single('file'), (req, res) => {
  const fileBuffer = req.file.buffer;
  const fileName = req.file.originalname;

  const params = {
    Bucket: 'bucket123test123',
    Key: fileName,
    Body: fileBuffer,
  };

  // client.upload(params, (err, data) => {
  //   if (err) {
  //     console.error(err);
  //     res.status(500).send('File upload to S3 failed.');
  //   } else {
  //     console.log(`File uploaded to S3 at ${data.Location}`);
  //     res.send('File uploaded to S3 successfully.');
  //   }
  // });
 const main = async () => {
  const command = new CreateBucketCommand(params);

  try {
    const response = await client.send(command);
    console.log(response);
  } catch (err) {
    console.error(err);
  }
};
main();
});
app.listen(PORT, function(err) {
  if (err) console.log(err);
  console.log("Server listening on PORT", PORT);
});





/** ======================== Create a Bucket =================================== */



/** ======================== List all Bucket =================================== */
// export const main = async () => {
//   const command = new CreateBucketCommand({
//     // The name of the bucket. Bucket names are unique and have several other constraints.
//     // See https://docs.aws.amazon.com/AmazonS3/latest/userguide/bucketnamingrules.html
//     Bucket: "sd342nbbj",
//   });

//   try {
//     const { Location } = await client.send(command);
//     console.log(`Bucket created with location ${Location}`);
//   } catch (err) {
//     console.error(err);
//   }
// };


/** ======================== List objects in the Bucket =================================== */


// export const main = async () => {
//   const command = new ListObjectsV2Command({
//     Bucket: "bucket123test123"
//   });

//   try {
//     let isTruncated = true;

//     console.log("Your bucket contains the following objects:\n");
//     let contents = "";

//     while (isTruncated) {
//       const { Contents, IsTruncated, NextContinuationToken } =
//         await client.send(command);
//       const contentsList = Contents.map((c) => ` • ${c.Key}`).join("\n");
//       contents += contentsList + "\n";
//       isTruncated = IsTruncated;
//       command.input.ContinuationToken = NextContinuationToken;
//     }
//     console.log(contents);
//   } catch (err) {
//     console.error(err);
//   }
// };

// main();


/** ======================== Delete a Bucket =================================== */

// export const main = async () => {
//   const command = new DeleteBucketCommand({
//     Bucket: "test-bucket",
//   });

//   try {
//     const response = await client.send(command);
//     console.log(response);
//   } catch (err) {
//     console.error(err);
//   }
// };

/** ======================== Upload a object to the Bucket =================================== */



// export const main = async () => {
//   const command = new PutObjectCommand({
//     Bucket: "sd342nbbj",
//     Key: "index.js",
//     Body: "Hello S3!",
//   });

//   try {
//     const response = await client.send(command);
//     console.log(response);
//   } catch (err) {
//     console.error(err);
//   }
// };
// main();

/** ======================== List all the Buckets =================================== */


// export const main = async () => {
//   const command = new ListBucketsCommand({});

//   try {
//     const { Owner, Buckets } = await client.send(command);
//     console.log(
//       `${Owner.DisplayName} owns ${Buckets.length} bucket${
//         Buckets.length === 1 ? "" : "s"
//       }:`,
//     );
//     console.log(`${Buckets.map((b) => ` • ${b.Name}`).join("\n")}`);
//   } catch (err) {
//     console.error(err);
//   }
// };
// main();

/** ======================== List all the Buckets =================================== */


// export const main = async () => {
//   const command = new ListBucketsCommand({});

//   try {
//     const { Owner, Buckets } = await client.send(command);
//     console.log(
//       `${Owner.DisplayName} owns ${Buckets.length} bucket${
//         Buckets.length === 1 ? "" : "s"
//       }:`,
//     );
//     console.log(`${Buckets.map((b) => ` • ${b.Name}`).join("\n")}`);
//   } catch (err) {
//     console.error(err);
//   }
// };
// main();

/** ======================== Add CORS to bucket =================================== */


// By default, Amazon S3 doesn't allow cross-origin requests. Use this command
// to explicitly allow cross-origin requests.
// export const main = async () => {
//   const command = new PutBucketCorsCommand({
//     Bucket: "bucket123test123",
//     CORSConfiguration: {
//       CORSRules: [
//         {
//           // Allow all headers to be sent to this bucket.
//           AllowedHeaders: ["*"],
//           // Allow only GET and PUT methods to be sent to this bucket.
//           AllowedMethods: ["GET", "PUT"],
//           // Allow only requests from the specified origin.
//           AllowedOrigins: ["https://www.example.com"],
//           // Allow the entity tag (ETag) header to be returned in the response. The ETag header
//           // The entity tag represents a specific version of the object. The ETag reflects
//           // changes only to the contents of an object, not its metadata.
//           ExposeHeaders: ["ETag"],
//           // How long the requesting browser should cache the preflight response. After
//           // this time, the preflight request will have to be made again.
//           MaxAgeSeconds: 3600,
//         },
//       ],
//     },
//   });

//   try {
//     const response = await client.send(command);
//     console.log(response);
//   } catch (err) {
//     console.error(err);
//   }
// };
// main();


/** ======================== Add policy to Bucket =================================== */



// export const main = async () => {
//   const command = new PutBucketPolicyCommand({
//     Policy: JSON.stringify({
//       Statement: [
//         {
//           Sid: "AllowGetObject",
//           // Allow this particular user to call GetObject on any object in this bucket.
//           Effect: "Allow",
//           Principal: {
//             AWS: "arn:aws:iam::558833305404:user/sivaranjitha",
//           },
//           Action: "s3:GetObject",
//           Resource: "arn:aws:s3:::bucket123test123/*",
//         },
//       ],
//     }),
//     // Apply the preceding policy to this bucket.
//     Bucket: "bucket123test123",
//   });

//   try {
//     const response = await client.send(command);
//     console.log(response);
//   } catch (err) {
//     console.error(err);
//   }
// };
// main();

/** ======================== copy object one Bucket to another bucket =================================== */


// export const main = async () => {
//   const command = new CopyObjectCommand({
//     CopySource: "sd342nbbj/hello-s3.txt",
//     Bucket: "bucket123test123",
//     Key: "sample.txt",
//   });

//   try {
//     const response = await client.send(command);
//     console.log(response);
//   } catch (err) {
//     console.error(err);
//   }
// };


// main();

/** ======================== Delete a bucket policy =================================== */


// This will remove the policy from the bucket.
// export const main = async () => {
//   const command = new DeleteBucketPolicyCommand({
//     Bucket: "sd342nbbj",
//   });

//   try {
//     const response = await client.send(command);
//     console.log(response);
//   } catch (err) {
//     console.error(err);
//   }
// };

// main();

/** ======================== Delete a object in a bucket =================================== */



// export const main = async () => {
//   const command = new DeleteObjectCommand({
//     Bucket: "sd342nbbj",
//     Key: "hello-s3.txt",
//   });

//   try {
//     const response = await client.send(command);
//     console.log(response);
//   } catch (err) {
//     console.error(err);
//   }
// };

// main();

/** ======================== Delete a multiple objects in a bucket =================================== */


// export const main = async () => {
//   const command = new DeleteObjectsCommand({
//     Bucket: "sd342nbbj",
//     Delete: {
//       Objects: [{ Key: "object1.txt" }, { Key: "object2.txt" }],
//     },
//   });

//   try {
//     const { Deleted } = await client.send(command);
//     console.log(
//       `Successfully deleted ${Deleted.length} objects from S3 bucket. Deleted objects:`,
//     );
//     console.log(Deleted.map((d) => ` • ${d.Key}`).join("\n"));
//   } catch (err) {
//     console.error(err);
//   }
// };

// main();

/** ======================== get the policy of the bucket =================================== */


// export const main = async () => {
//   const command = new GetBucketPolicyCommand({
//     Bucket: "bucket123test123",
//   });

//   try {
//     const { Policy } = await client.send(command);
//     console.log(JSON.parse(Policy));
//   } catch (err) {
//     console.error(err);
//   }
// };
// main();

/** ======================== upload large object to the bucket =================================== */

// import {
//   CreateMultipartUploadCommand,
//   UploadPartCommand,
//   CompleteMultipartUploadCommand,
//   AbortMultipartUploadCommand,
// } from "@aws-sdk/client-s3";

// import fs from 'fs';
// const filePath = '/Users/ranjitha-18338/aws-s3/js/Leo_2023.mp4';
// let file_size = 0;
// function sleep(ms) {
//   return new Promise((resolve) => {
//       setTimeout(resolve, ms);
//   });
// }
// fs.stat(filePath, (err,data) => {
//  if(err) console.log(err);
//  file_size = data.size;
//  console.log("file :",file_size);
//  console.log("size :",data.size + 1);
// });
// await sleep(2000);
// console.log(file_size);
// const twentyFiveMB = file_size;

// console.log(twentyFiveMB);
// export const createString = (size = twentyFiveMB) => {
//   // Initialize an empty Buffer

//   return "x".repeat(size);
// };



// export const multiPartUpload = async () => {
//   const bucketName = "bucket123test123";
//   const key = "demo.mp4";
//   const readableStream = fs.createReadStream("/Users/ranjitha-18338/aws-s3/js/Leo_2023.mp4");
//   let buffer = Buffer.alloc(0);

// // Listen for 'data' events and concatenate chunks into the Buffer
// readableStream.on('data', (chunk) => {
//   buffer = Buffer.concat([buffer, chunk]);
// });

// // Listen for the 'end' event to know when the stream has ended
// readableStream.on('end', () => {
//   console.log('Stream ended.');
//   console.log('Buffer:', buffer.toString());
// });

//   let uploadId;

//   try {
//     const multipartUpload = await client.send(
//       new CreateMultipartUploadCommand({
//         Bucket: bucketName,
//         Key: key,
//       }),
//     );

//     uploadId = multipartUpload.UploadId;

//     const uploadPromises = [];
//     // Multipart uploads require a minimum size of 5 MB per part.
//     console.log(buffer.length);
//     const partSize = Math.ceil(buffer.length / 5);
//       console.log(partSize);
//     // Upload each part.
//     for (let i = 0; i < 5; i++) {
//       const start = i * partSize;
//       const end = start + partSize;
//       uploadPromises.push(
//         client
//           .send(
//             new UploadPartCommand({
//               Bucket: bucketName,
//               Key: key,
//               UploadId: uploadId,
//               Body: buffer.subarray(start, end),
//               PartNumber: i + 1,
//             }),
//           )
//           .then((d) => {
//             console.log("Part", i + 1, "uploaded");
//             return d;
//           }),
//       );
//     }

//     const uploadResults = await Promise.all(uploadPromises);

//     console.log("completed");
//     return await client.send(
//       new CompleteMultipartUploadCommand({
//         Bucket: bucketName,
//         Key: key,
//         UploadId: uploadId,
//         MultipartUpload: {
//           Parts: uploadResults.map(({ ETag }, i) => ({
//             ETag,
//             PartNumber: i + 1,
//           })),
//         },
//       }),
//     );

//     // Verify the output by downloading the file from the Amazon Simple Storage Service (Amazon S3) console.
//     // Because the output is a 25 MB string, text editors might struggle to open the file.
//   } catch (err) {
//     console.error(err);

//     if (uploadId) {
//       const abortCommand = new AbortMultipartUploadCommand({
//         Bucket: bucketName,
//         Key: key,
//         UploadId: uploadId,
//       });
//       console.log("aborted");
//       await client.send(abortCommand);
//     }
//   }
// };
// multiPartUpload();

/** ======================== download large object to the bucket =================================== */

// import { GetObjectCommand } from "@aws-sdk/client-s3";
// import { createWriteStream } from "fs";
// import { fileURLToPath } from 'url';

// const oneMB = 1024 * 1024;

// export const getObjectRange = ({ bucket, key, start, end }) => {
//   const command = new GetObjectCommand({
//     Bucket: bucket,
//     Key: key,
//     Range: `bytes=${start}-${end}`,
//   });

//   return client.send(command);
// };

// export const getRangeAndLength = (contentRange) => {
//   const [range, length] = contentRange.split("/");
//   const [start, end] = range.split("-");
//   return {
//     start: parseInt(start),
//     end: parseInt(end),
//     length: parseInt(length),
//   };
// };

// export const isComplete = ({ end, length }) => end === length - 1;

// // When downloading a large file, you might want to break it down into
// // smaller pieces. Amazon S3 accepts a Range header to specify the start
// // and end of the byte range to be downloaded.
// const downloadInChunks = async ({ bucket, key }) => {
//   const writeStream = createWriteStream(
//     fileURLToPath(new URL(`./${key}`, import.meta.url))
//   ).on("error", (err) => console.error(err));

//   let rangeAndLength = { start: -1, end: -1, length: -1 };

//   while (!isComplete(rangeAndLength)) {
//     const { end } = rangeAndLength;
//     const nextRange = { start: end + 1, end: end + oneMB };

//     console.log(`Downloading bytes ${nextRange.start} to ${nextRange.end}`);

//     const { ContentRange, Body } = await getObjectRange({
//       bucket,
//       key,
//       ...nextRange,
//     });

//     writeStream.write(await Body.transformToByteArray());
//     rangeAndLength = getRangeAndLength(ContentRange);
//   }
// };

// export const multiPartDownload = async () => {
//   await downloadInChunks({
//     bucket: "bucket123test123",
//     key: "multipart.txt",
//   });
// };
// multiPartDownload();

/** ============== Download part of the object  */

// import { path } from '@ffmpeg-installer/ffmpeg';
// import  ffmpeg from 'fluent-ffmpeg';
// import fs from 'fs';
// ffmpeg.setFfmpegPath(path);
// const params = {
//   Bucket: "bucket123test123",
//   Key: "Leo 2023 Sample.mp4"
// };
// import { Readable } from 'stream';
// import { GetObjectCommand } from "@aws-sdk/client-s3";


// export const main = async () => {
//   const command1 = new GetObjectCommand(params);
//   try {
//     const response = await client.send(command1);
    // The Body object also has 'transformToByteArray' and 'transformToWebStream' methods.
    // const de = new TextEncoderStream();
    // const sample = videoStream.pipeThrough(de);

    //const outputPath = 'sam.mp4';
    // // const sam = fs.writeFileSync('samp.mp4');
    // const sam1 = await response.Body.transformToString();
    // // console.log(sam1);
    // const readableStream = new Readable({
    //   read() {
    //     // Push the input string into the stream
    //     this.push(sam1);
    //     // Mark the end of the stream
    //     this.push(null);
    //   },
    // });
    // sam1.pipeTo(sam);
    //const str = fs.createReadStream("/Users/ranjitha-18338/aws-s3/js/Leo_2023.mp4");
    // const customStream = new Readable({
    //   read(size) {
    //     // Read data from the response and push it into the custom stream
    //     response.Body.on('data', (chunk) => {
    //       this.push(chunk);
    //     });
  
    //     // End the custom stream when the response ends
    //     response.Body.on('end', () => {
    //       this.push(null);
    //     });
  
    //     // Handle errors
    //     response.Body.on('error', (err) => {
    //       console.error('Response error:', err);
    //       this.emit('error', err);
    //     });
    //   },
    // });
  //  console.log(customStream instanceof Readable);

   //console.log(sam);
  // str.on('readable', () => {
    // Start processing when the stream is readable
    // ...
//     const command = ffmpeg() .input(str)
//     .setStartTime(30)  .setDuration(10) // Duration in seconds
//     .output(outputPath).format('mp4')
//     .on('end', () => {
//       console.log('Video segment extracted successfully.');
//   })
//   .on('error', (err) => {
//       console.error('Error:', err);
//   });
//   command.run();
//   });
    
  

    
//   } catch (err) {
//     console.error(err);
//   }
// };
// main();




