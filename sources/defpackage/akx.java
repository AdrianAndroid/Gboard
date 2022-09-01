package defpackage;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.viewpager.widget.ViewPager;

/* compiled from: PG */
/* renamed from: akx  reason: default package */
/* loaded from: classes.dex */
final class akx extends yd {
    final /* synthetic */ alc a;

    public akx(alc alcVar) {
        this.a = alcVar;
    }

    @Override // defpackage.yd
    public final void a(View view, AccessibilityEvent accessibilityEvent) {
        super.a(view, accessibilityEvent);
        accessibilityEvent.setClassName(ViewPager.class.getName());
    }

    @Override // defpackage.yd
    public final void b(View view, abj abjVar) {
        int i;
        int i2;
        super.b(view, abjVar);
        abjVar.h(ViewPager.class.getName());
        akt aktVar = this.a.c;
        boolean z = false;
        if (aktVar != null && aktVar.a() > 1) {
            z = true;
        }
        abjVar.l(z);
        alc alcVar = this.a;
        akt aktVar2 = alcVar.c;
        if (aktVar2 != null && (i2 = alcVar.d) >= 0 && i2 < aktVar2.a() - 1) {
            abjVar.d(4096);
        }
        alc alcVar2 = this.a;
        akt aktVar3 = alcVar2.c;
        if (aktVar3 == null || (i = alcVar2.d) <= 0 || i >= aktVar3.a()) {
            return;
        }
        abjVar.d(8192);
    }

    @Override // defpackage.yd
    public final boolean h(View view, int i, Bundle bundle) {
        int i2;
        alc alcVar;
        akt aktVar;
        int i3;
        if (super.h(view, i, bundle)) {
            return true;
        }
        if (i == 4096) {
            alc alcVar2 = this.a;
            akt aktVar2 = alcVar2.c;
            if (aktVar2 == null || (i2 = alcVar2.d) < 0 || i2 >= aktVar2.a() - 1) {
                return false;
            }
            alc alcVar3 = this.a;
            alcVar3.fF(alcVar3.d + 1);
            return true;
        } else if (i != 8192 || (aktVar = (alcVar = this.a).c) == null || (i3 = alcVar.d) <= 0 || i3 >= aktVar.a()) {
            return false;
        } else {
            alc alcVar4 = this.a;
            alcVar4.fF(alcVar4.d - 1);
            return true;
        }
    }
}
