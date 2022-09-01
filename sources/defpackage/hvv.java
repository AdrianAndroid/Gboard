package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: PG */
/* renamed from: hvv  reason: default package */
/* loaded from: classes.dex */
final class hvv implements lgb {
    final /* synthetic */ Context a;
    final /* synthetic */ int b;
    final /* synthetic */ ViewGroup c;

    public hvv(Context context, int i, ViewGroup viewGroup) {
        this.a = context;
        this.b = i;
        this.c = viewGroup;
    }

    @Override // defpackage.lgb
    public final /* bridge */ /* synthetic */ Object a() {
        View inflate = LayoutInflater.from(this.a).inflate(this.b, this.c, false);
        this.c.addView(inflate, 0);
        return inflate;
    }
}
