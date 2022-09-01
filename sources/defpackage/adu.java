package defpackage;

import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: adu  reason: default package */
/* loaded from: classes.dex */
public final class adu extends ContentObserver {
    final /* synthetic */ adv a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public adu(adv advVar, Handler handler) {
        super(handler);
        this.a = advVar;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z, Uri uri) {
        this.a.a();
    }
}
