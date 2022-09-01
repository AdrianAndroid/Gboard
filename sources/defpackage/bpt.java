package defpackage;

import android.animation.Animator;
import com.google.android.apps.inputmethod.latin.keyboard.LatinSymbolsKeyboard;

/* compiled from: PG */
/* renamed from: bpt  reason: default package */
/* loaded from: classes.dex */
public final class bpt implements hws {
    final /* synthetic */ hww a;
    final /* synthetic */ LatinSymbolsKeyboard b;

    public bpt(LatinSymbolsKeyboard latinSymbolsKeyboard, hww hwwVar) {
        this.b = latinSymbolsKeyboard;
        this.a = hwwVar;
    }

    @Override // defpackage.hws
    public final /* synthetic */ void hL() {
    }

    @Override // defpackage.hws
    public final void hM() {
        this.b.D(this.a);
    }

    @Override // defpackage.hws
    public final /* synthetic */ Animator m() {
        return null;
    }
}
