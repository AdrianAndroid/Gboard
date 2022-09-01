package defpackage;

import java.util.Map;

/* compiled from: PG */
/* renamed from: git  reason: default package */
/* loaded from: classes.dex */
public final class git {
    public int a;
    public int b;
    public gip c;
    public int d;
    public int e;
    public int f;
    public Map g;
    public byte h;

    public final giu a() {
        gip gipVar;
        Map map;
        if (this.h != 63 || (gipVar = this.c) == null || (map = this.g) == null) {
            StringBuilder sb = new StringBuilder();
            if ((this.h & 1) == 0) {
                sb.append(" styleId");
            }
            if ((this.h & 2) == 0) {
                sb.append(" stickerId");
            }
            if (this.c == null) {
                sb.append(" avatarHashCode");
            }
            if ((this.h & 4) == 0) {
                sb.append(" width");
            }
            if ((this.h & 8) == 0) {
                sb.append(" height");
            }
            if ((this.h & 16) == 0) {
                sb.append(" padding");
            }
            if ((this.h & 32) == 0) {
                sb.append(" backgroundColor");
            }
            if (this.g == null) {
                sb.append(" customizationMap");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        return new giu(this.a, this.b, gipVar, this.d, this.e, this.f, map);
    }
}
