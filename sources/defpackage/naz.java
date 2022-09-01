package defpackage;

import java.util.List;

/* compiled from: PG */
/* renamed from: naz  reason: default package */
/* loaded from: classes2.dex */
public enum naz implements nbd {
    COMMA(","),
    JOIN("JOIN"),
    INNER_JOIN("INNER JOIN"),
    CROSS_JOIN("CROSS JOIN"),
    LEFT_JOIN("LEFT JOIN"),
    LEFT_OUTER_JOIN("LEFT OUTER JOIN");
    
    private final llp h;

    naz(String str) {
        llp r = llp.r(str);
        oll.d(r, "of(token)");
        this.h = r;
    }

    @Override // defpackage.nbd
    public final /* synthetic */ List a() {
        return this.h;
    }
}
