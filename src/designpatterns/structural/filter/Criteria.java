/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatterns.structural.filter;

import java.util.List;

/**
 *
 * @author Francesco
 */
public interface Criteria
{
    List<Person> meetCriteria(List<Person> persons);
}
