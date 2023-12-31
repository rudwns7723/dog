package kr.spring.walk.vo;

import java.io.IOException;
import java.sql.Date;
import java.util.Arrays;

import org.springframework.web.multipart.MultipartFile;

public class WalkVO {
	private int walk_num;
	private String walk_region;
	private String walk_position;
	private String mem_id;
	private String mem_name;
	
	private int walk_detail_num;
	private int walk_bookmark;
	private Date walk_date;
	private byte[] walk_img;
	private String walk_img_name;
	
	private String walk_info;
	private int walk_perm;
	private int mem_num;
	private int walk_distance;
	private String walk_address;				//지번주소
	private String walk_road;					//도로명주소
	
	
	public void setUpload(MultipartFile upload) throws IOException{

		//MultipartFile -> byte[]
		setWalk_img(upload.getBytes());
		//파일 이름
		setWalk_img_name(upload.getOriginalFilename());
	}
	
	public String getMem_name() {
		return mem_name;
	}
	
	public void setMem_name(String mem_name) {
		this.mem_name = mem_name;
	}
	public String getWalk_address() {
		return walk_address;
	}
	public void setWalk_address(String walk_address) {
		this.walk_address = walk_address;
	}
	public String getWalk_road() {
		return walk_road;
	}
	public void setWalk_road(String walk_road) {
		this.walk_road = walk_road;
	}
	public byte[] getWalk_img() {
		return walk_img;
	}
	public void setWalk_img(byte[] walk_img) {
		this.walk_img = walk_img;
	}
	public String getWalk_img_name() {
		return walk_img_name;
	}
	public void setWalk_img_name(String walk_img_name) {
		this.walk_img_name = walk_img_name;
	}
	
	public int getWalk_distance() {
		return walk_distance;
	}
	public void setWalk_distance(int walk_distance) {
		this.walk_distance = walk_distance;
	}
	public String getMem_id() {
		return mem_id;
	}
	public void setMem_id(String mem_id) {
		this.mem_id = mem_id;
	}
	public String getWalk_info() {
		return walk_info;
	}
	public void setWalk_info(String walk_info) {
		this.walk_info = walk_info;
	}
	public int getWalk_num() {
		return walk_num;
	}
	public void setWalk_num(int walk_num) {
		this.walk_num = walk_num;
	}
	public String getWalk_region() {
		return walk_region;
	}
	public void setWalk_region(String walk_region) {
		this.walk_region = walk_region;
	}
	public String getWalk_position() {
		return walk_position;
	}
	public void setWalk_position(String walk_position) {
		this.walk_position = walk_position;
	}
	public int getWalk_detail_num() {
		return walk_detail_num;
	}
	public void setWalk_detail_num(int walk_detail_num) {
		this.walk_detail_num = walk_detail_num;
	}
	public int getWalk_bookmark() {
		return walk_bookmark;
	}
	public void setWalk_bookmark(int walk_bookmark) {
		this.walk_bookmark = walk_bookmark;
	}
	public Date getWalk_date() {
		return walk_date;
	}
	public void setWalk_date(Date walk_date) {
		this.walk_date = walk_date;
	}
	public int getWalk_perm() {
		return walk_perm;
	}
	public void setWalk_perm(int walk_perm) {
		this.walk_perm = walk_perm;
	}
	public int getMem_num() {
		return mem_num;
	}
	public void setMem_num(int mem_num) {
		this.mem_num = mem_num;
	}

	@Override
	public String toString() {
		return "WalkVO [walk_num=" + walk_num + ", walk_region=" + walk_region + ", walk_position=" + walk_position
				+ ", mem_id=" + mem_id + ", mem_name=" + mem_name + ", walk_detail_num=" + walk_detail_num
				+ ", walk_bookmark=" + walk_bookmark + ", walk_date=" + walk_date + ", walk_img="
				+ Arrays.toString(walk_img) + ", walk_img_name=" + walk_img_name + ", walk_info=" + walk_info
				+ ", walk_perm=" + walk_perm + ", mem_num=" + mem_num + ", walk_distance=" + walk_distance
				+ ", walk_address=" + walk_address + ", walk_road=" + walk_road + "]";
	}

}
