package defpackage;

import java.util.List;

/* compiled from: PG */
/* renamed from: bmj  reason: default package */
/* loaded from: classes.dex */
public class bmj {
    private final blb a;
    private final bmd b;
    private final blw c;
    private final nwo d;

    public bmj(blb blbVar) {
        jdg.u(blbVar);
        this.a = blbVar;
        this.d = null;
        this.b = null;
        this.c = null;
    }

    public blw a() {
        blb blbVar = this.a;
        if (blbVar == null) {
            bmd bmdVar = this.b;
            if (bmdVar == null) {
                blw blwVar = this.c;
                jdg.u(blwVar);
                return blwVar;
            }
            throw bmdVar;
        }
        throw blbVar;
    }

    public bmj b(List list) {
        return new bmj(this, list);
    }

    public final nwo c() {
        blb blbVar = this.a;
        if (blbVar != null) {
            throw blbVar;
        }
        nwo nwoVar = this.d;
        jdg.u(nwoVar);
        return nwoVar;
    }

    public bmj(bmd bmdVar) {
        jdg.u(bmdVar);
        this.a = null;
        this.d = bmdVar.a();
        this.b = bmdVar;
        this.c = null;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.List, java.lang.Object] */
    public bmj(bmj bmjVar, List list) {
        jdg.u(bmjVar.d);
        jdg.v(!list.isEmpty());
        this.a = bmjVar.a;
        nwo nwoVar = bmjVar.d;
        nwo nwoVar2 = new nwo(nwoVar.a, (String) nwoVar.c, nwoVar.b, list);
        this.d = nwoVar2;
        if (bmjVar.b == null) {
            this.b = null;
        } else {
            this.b = new bmd(nwoVar2, null);
        }
        this.c = bmjVar.c;
    }

    public bmj(nwo nwoVar, blw blwVar, byte[] bArr) {
        this.a = null;
        jdg.u(nwoVar);
        this.d = nwoVar;
        this.b = null;
        jdg.u(blwVar);
        this.c = blwVar;
    }
}
