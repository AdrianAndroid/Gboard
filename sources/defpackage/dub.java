package defpackage;

import android.text.TextUtils;

/* compiled from: PG */
/* renamed from: dub  reason: default package */
/* loaded from: classes.dex */
final class dub extends hqi {
    final /* synthetic */ dud a;

    public dub(dud dudVar) {
        this.a = dudVar;
    }

    @Override // defpackage.hqi
    protected final void a(hpy hpyVar) {
        int length;
        dud dudVar = this.a;
        duc ducVar = (duc) dudVar.e.get();
        if (!TextUtils.equals(ducVar.a.c, hpyVar.c) || !TextUtils.equals(ducVar.a.d(), hpyVar.d())) {
            if (TextUtils.isEmpty(hpyVar.c) || dudVar.f.get()) {
                dudVar.e.set(duc.b(hpyVar, false));
                return;
            }
            int a = dud.a(hpyVar.c);
            int a2 = dud.a(ducVar.a.c);
            if (a < a2) {
                int i = a2 - a;
                for (int i2 = 0; i2 < i; i2++) {
                    dudVar.g.e(dua.PUNCTUATION_DELETED_AFTER_NGA_DICTATION, new Object[0]);
                }
            } else if (ducVar.b && a == a2 + 1) {
                dudVar.g.e(dua.PUNCTUATION_EDITED_AFTER_NGA_DICTATION, new Object[0]);
            }
            boolean z = hpyVar.c.length() == ducVar.a.c.length() + (-1) && a == a2 + (-1);
            if (z) {
                CharSequence charSequence = hpyVar.c;
                CharSequence charSequence2 = ducVar.a.c;
                int length2 = charSequence2.length();
                if (length2 != 0 && dud.b.contains(Character.valueOf(charSequence2.charAt(length2 - 1))) && ((length = charSequence.length()) == 0 || !dud.b.contains(Character.valueOf(charSequence.charAt(length - 1))))) {
                    dudVar.g.e(dua.PUNCTUATION_AT_END_DELETED_AFTER_NGA_DICTATION, new Object[0]);
                }
            }
            dudVar.e.set(duc.b(hpyVar, z));
        }
    }

    @Override // defpackage.hqi
    protected final void c() {
        this.a.b();
    }
}
