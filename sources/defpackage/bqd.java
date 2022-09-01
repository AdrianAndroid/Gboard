package defpackage;

import android.animation.Animator;
import android.view.View;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* renamed from: bqd  reason: default package */
/* loaded from: classes.dex */
public final class bqd implements hws {
    public final bqc a;
    public View b;

    public bqd(bqc bqcVar) {
        this.a = bqcVar;
    }

    public final void a() {
        this.a.l().i(ice.HEADER, R.id.key_pos_password_header_numbers, false, hwv.DEFAULT, true);
    }

    @Override // defpackage.hws
    public final /* synthetic */ void hL() {
    }

    @Override // defpackage.hws
    public final void hM() {
        a();
    }

    @Override // defpackage.hws
    public final /* synthetic */ Animator m() {
        return null;
    }
}
