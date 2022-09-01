package defpackage;

import android.content.Context;
import androidx.preference.Preference;

/* compiled from: PG */
/* renamed from: inr  reason: default package */
/* loaded from: classes.dex */
public final class inr implements inh {
    private final Context a;

    public inr(Context context) {
        this.a = context;
    }

    @Override // defpackage.inh
    public final void b(ini iniVar, Object obj, Object obj2, boolean z) {
        if (!brh.c(this.a, (Preference) obj2)) {
            iniVar.u(obj2);
        }
    }

    @Override // defpackage.inh
    public final /* synthetic */ void c(ini iniVar, Object obj, Object obj2, boolean z) {
    }
}
