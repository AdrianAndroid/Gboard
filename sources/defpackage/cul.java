package defpackage;

import android.support.v7.widget.GridLayoutManager;

/* compiled from: PG */
/* renamed from: cul  reason: default package */
/* loaded from: classes.dex */
public final class cul extends ku {
    private final cuj c;
    private final GridLayoutManager d;

    public cul(cuj cujVar, GridLayoutManager gridLayoutManager) {
        this.c = cujVar;
        this.d = gridLayoutManager;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [cuw, java.lang.Object] */
    @Override // defpackage.ku
    public final int b(int i) {
        cuj cujVar = this.c;
        int i2 = 1;
        if (i >= 0 && i < cujVar.d.size()) {
            Object obj = ((cuq) cujVar.d.get(i)).a;
            i2 = cujVar.O(obj.getClass()).b.c(obj);
        }
        return i2 == -1 ? this.d.b : i2;
    }
}
