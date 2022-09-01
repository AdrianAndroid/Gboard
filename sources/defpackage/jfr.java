package defpackage;

import android.util.AttributeSet;
import java.util.Set;

/* compiled from: PG */
/* renamed from: jfr  reason: default package */
/* loaded from: classes.dex */
public final class jfr implements jfq {
    private static final String[] a = {"if", "else_if", "else"};
    private final llw b;
    private boolean c = true;

    public jfr(llw llwVar) {
        this.b = llwVar;
    }

    private static boolean c(String str) {
        return "if".equals(str) || "else_if".equals(str);
    }

    private final boolean d(jfy jfyVar, jfx jfxVar, Set set) {
        AttributeSet a2 = jfyVar.a();
        int attributeCount = a2.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            jfn jfnVar = (jfn) this.b.get(a2.getAttributeName(i));
            if (jfnVar != null) {
                set.add(jfnVar.b());
                if (jfnVar.d(a2, i)) {
                }
            }
            return false;
        }
        jfyVar.e(jfxVar);
        return true;
    }

    @Override // defpackage.jfq
    public final void a(jfy jfyVar, jfx jfxVar, String str, Set set) {
        String b = jfyVar.b();
        if ("if".equals(b)) {
            this.c = d(jfyVar, jfxVar, set);
        } else if ("else_if".equals(b)) {
            if (!c(str)) {
                throw jfyVar.c("else_if tags should follow an if or else_if tag instead of ".concat(String.valueOf(str)));
            }
            if (this.c) {
                return;
            }
            this.c = d(jfyVar, jfxVar, set);
        } else if (!"else".equals(b)) {
        } else {
            if (!c(str)) {
                throw jfyVar.c("else tags should follow an if or else_if tag instead of ".concat(String.valueOf(str)));
            }
            if (this.c) {
                return;
            }
            jfyVar.e(jfxVar);
            this.c = true;
        }
    }

    @Override // defpackage.jfq
    public final String[] b() {
        return a;
    }
}
