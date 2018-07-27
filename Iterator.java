@SuppressWarnings("rawtypes")
    public List<Position> getOpenPositions(String cusip) {
        
        String hql = "DATABASE QUERY HERE";

        List<Position> list = new ArrayList<>();
        Query query = getSessionFactory().openSession().createQuery(hql);
        Iterator iterator = query.list().iterator();

        while (iterator.hasNext()) {
            Object[] tuple = (Object[]) iterator.next();

            Position p = new Position();
            p.setCusip(tuple[0].toString());
            p.setStartDate((Date) tuple[1]);
            p.setEndDate((Date) tuple[2]);
            list.add(p);
        }
        return list;
    }
