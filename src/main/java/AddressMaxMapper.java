import java.io.IOException;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;



public class AddressMaxMapper
  extends Mapper<LongWritable, Text, Text, IntWritable> {
  
  @Override
  public void map(LongWritable key, Text value, Context context)
      throws IOException, InterruptedException {
    
        String line = value.toString();
        // line=line.split("GET ")[1];
  
        // context.write(new Text(line.split(" ")[0]), new IntWritable(1));

        context.write(new Text(line.split("\\s+")[6]), new IntWritable(1));

    
  }
}