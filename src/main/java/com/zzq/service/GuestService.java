package com.zzq.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zzq.bean.Guest;
import com.zzq.mapper.GuestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Classname GuestService
 * @Description TODO
 * @Date 2020/3/23 11:27 PM
 * @Created by 张志强
 */
@Service
public class GuestService extends ServiceImpl<GuestMapper, Guest> implements IService<Guest> {

}
