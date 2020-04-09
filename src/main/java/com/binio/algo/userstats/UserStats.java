package com.binio.algo.userstats;

import java.util.Optional;

public class UserStats {
    Optional<Long> visitCount;

    public Optional<Long> getVisitCount() {
        return visitCount;
    }

    public void setVisitCount(final Optional<Long> visitCount) {
        this.visitCount = visitCount;
    }
}
