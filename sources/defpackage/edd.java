package defpackage;

import android.support.v7.widget.LinearLayoutManager;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: edd  reason: default package */
/* loaded from: classes.dex */
public final class edd extends LinearLayoutManager {
    final /* synthetic */ ede a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public edd(ede edeVar) {
        super(0);
        this.a = edeVar;
    }

    @Override // android.support.v7.widget.LinearLayoutManager, defpackage.ly
    public final boolean ae() {
        return super.ae() && this.a.e.get();
    }
}
