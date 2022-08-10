package com.bizcenter.freight.infrastructure.persistence.convertor;

import java.util.List;

public interface IEntityConverter<P, E> {

    P entity2Po(E e);

    E po2Entity(P p);

    List<P> entityList2PoList(List<E> eList);

    List<E> poList2EntityList(List<P> pList);

}
