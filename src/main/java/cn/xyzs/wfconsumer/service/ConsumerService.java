package cn.xyzs.wfconsumer.service;

import com.codingapi.tx.annotation.TxTransaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestTemplate;

@Service
public class ConsumerService {
    @Autowired
    RestTemplate restTemplate;

    @TxTransaction(isStart = true)
    @Transactional
    public String getData(){
        return restTemplate.getForEntity("http://service-worker/hello",String.class).getBody();
    }
}
