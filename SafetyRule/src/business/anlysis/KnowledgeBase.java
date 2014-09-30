/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.anlysis;

import business.HealthSystem;
import business.enterprise.Hospital;
import business.network.Network;
import business.report.Report;
import business.workQueue.ReportWorkRequest;
import business.workQueue.WorkQueue;
import business.workQueue.WorkRequest;
import java.util.HashSet;

/**
 *
 * @author skipper
 */
public class KnowledgeBase {
    private HashSet<Entry> regionCount;
    private HashSet<Entry> categoryCount;
    
    public KnowledgeBase(){
        regionCount = new HashSet<>();
        categoryCount = new HashSet<>();
    }

    public HashSet<Entry> getRegionCount() {
        return regionCount;
    }

    public HashSet<Entry> getCategoryCount() {
        return categoryCount;
    }
    
    public HashSet<Entry> calculateRegionCount(HealthSystem system, WorkQueue wq){
        regionCount.removeAll(regionCount);
        for(WorkRequest wr:wq.getWorkRequestList()){
            Hospital hos = ((ReportWorkRequest)wr).getReport().getBasic().getHospital();
            Network net = hos.findNetwork(system, hos).get(1);
            if(regionCount.isEmpty()){
                Entry e1 = new Entry();
                e1.setTitle(net.getName());
                e1.setQuantity(1);
                regionCount.add(e1);
            }else{
                int flag = 1;
                for(Entry e:regionCount){
                    if(net.getName().equals(e.getTitle())){
                        e.addQuantity();
                        break;
                    }
                    if(flag == regionCount.size()){
                        Entry en = new Entry();
                        en.setTitle(net.getName());
                        en.setQuantity(1);
                        regionCount.add(en);
                        break;
                    }
                    flag++;
                }
            }
        }
        return regionCount;
    }
    
    public HashSet<Entry> calculateCategoryCount(HealthSystem system, WorkQueue wq){
        categoryCount.removeAll(categoryCount);
        for(WorkRequest wr:wq.getWorkRequestList()){
            HashSet<String> events = ((ReportWorkRequest)wr).getReport().getBasic().getEventCategories();
            for(String s: events){
                if(categoryCount.isEmpty()){
                    Entry e1 = new Entry();
                    e1.setTitle(s);
                    e1.setQuantity(1);
                    categoryCount.add(e1);
                }else{
                    int flag = 1;
                    for(Entry e:categoryCount){
                        if(s.equals(e.getTitle())){
                            e.addQuantity();
                            break;
                        }
                        if(flag == categoryCount.size()){
                            Entry en = new Entry();
                            en.setTitle(s);
                            en.setQuantity(1);
                            categoryCount.add(en);
                            break;
                        }
                        flag++;
                    }
                }
            }
            
        }
        return categoryCount;
    }
}
