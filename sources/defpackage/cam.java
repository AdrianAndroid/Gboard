package defpackage;

import com.google.android.apps.inputmethod.libs.delight5.Delight5Facilitator;

/* compiled from: PG */
/* renamed from: cam  reason: default package */
/* loaded from: classes.dex */
public final class cam extends gxu {
    final /* synthetic */ Delight5Facilitator a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cam(Delight5Facilitator delight5Facilitator) {
        super("FlushUserHistory");
        this.a = delight5Facilitator;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.h.w();
        this.a.c.set(null);
    }
}
