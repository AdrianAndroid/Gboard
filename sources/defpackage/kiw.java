package defpackage;

import android.database.ContentObserver;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: kiw  reason: default package */
/* loaded from: classes.dex */
public final class kiw extends ContentObserver {
    final /* synthetic */ kix a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kiw(kix kixVar) {
        super(null);
        this.a = kixVar;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        kix kixVar = this.a;
        synchronized (kixVar.d) {
            kixVar.e = null;
            kju.e();
        }
        synchronized (kixVar) {
            for (kiy kiyVar : kixVar.f) {
                kiyVar.a();
            }
        }
    }
}
