package defpackage;

import com.google.android.libraries.inputmethod.trainingcache.storage.StorageAdapterFactory;

/* compiled from: PG */
/* renamed from: ixb  reason: default package */
/* loaded from: classes.dex */
public final class ixb implements ijj {
    final /* synthetic */ rj a;
    final /* synthetic */ StorageAdapterFactory b;

    public ixb() {
    }

    public ixb(StorageAdapterFactory storageAdapterFactory, rj rjVar) {
        this.b = storageAdapterFactory;
        this.a = rjVar;
    }

    @Override // defpackage.ijj
    public final /* bridge */ /* synthetic */ void fd(ijg ijgVar) {
        this.a.c((ixc) ijgVar);
        ijl.b().d(this, ixc.class);
        this.b.listenerHolder = null;
    }

    @Override // defpackage.ijj
    public final /* synthetic */ void fe(Class cls) {
    }
}
