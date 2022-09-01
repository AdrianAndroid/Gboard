package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;

/* compiled from: PG */
/* renamed from: jpg  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class jpg implements jnf {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ jpg(IOException iOException, int i) {
        this.b = i;
        this.a = iOException;
    }

    public /* synthetic */ jpg(String str, int i) {
        this.b = i;
        this.a = str;
    }

    public /* synthetic */ jpg(Throwable th, int i) {
        this.b = i;
        this.a = th;
    }

    public /* synthetic */ jpg(ArrayList arrayList, int i) {
        this.b = i;
        this.a = arrayList;
    }

    public /* synthetic */ jpg(HashSet hashSet, int i) {
        this.b = i;
        this.a = hashSet;
    }

    public /* synthetic */ jpg(jqm jqmVar, int i) {
        this.b = i;
        this.a = jqmVar;
    }

    public /* synthetic */ jpg(jye jyeVar, int i) {
        this.b = i;
        this.a = jyeVar;
    }

    public /* synthetic */ jpg(jzl jzlVar, int i) {
        this.b = i;
        this.a = jzlVar;
    }

    @Override // defpackage.jnf
    public final void a(Object obj) {
        switch (this.b) {
            case 0:
                Object obj2 = this.a;
                int i = jph.c;
                ((HashSet) obj2).add(((jtr) obj).b());
                return;
            case 1:
                ((HashSet) this.a).add((jtr) obj);
                return;
            case 2:
                ((jra) obj).j((Throwable) this.a);
                return;
            case 3:
                ((jra) obj).o((String) this.a);
                return;
            case 4:
                ((jra) obj).a((String) this.a);
                return;
            case 5:
                jdg.u(this.a);
                ((jrc) obj).b();
                return;
            case 6:
                ((jra) obj).a((String) this.a);
                return;
            case 7:
                ((jra) obj).o((String) this.a);
                return;
            case 8:
                Object obj3 = this.a;
                int i2 = jvl.b;
                ((jul) obj).j((Throwable) obj3);
                return;
            case 9:
                ((ArrayList) this.a).add((mfm) obj);
                return;
            case 10:
                Object obj4 = this.a;
                Object obj5 = jzg.a;
                ((jzd) obj).p((Throwable) obj4);
                return;
            default:
                Object obj6 = this.a;
                Object obj7 = jzg.a;
                ((jzd) obj).p((Throwable) obj6);
                return;
        }
    }
}
