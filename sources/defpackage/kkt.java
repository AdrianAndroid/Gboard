package defpackage;

import android.database.sqlite.SQLiteException;
import java.io.IOException;

/* compiled from: PG */
/* renamed from: kkt  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class kkt implements miy {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    private final /* synthetic */ int e;

    public /* synthetic */ kkt(String str, kkm kkmVar, kjj kjjVar, klf klfVar, int i) {
        this.e = i;
        this.d = str;
        this.c = kkmVar;
        this.a = kjjVar;
        this.b = klfVar;
    }

    public /* synthetic */ kkt(jwz jwzVar, jsr jsrVar, jsr jsrVar2, juc jucVar, int i) {
        this.e = i;
        this.d = jwzVar;
        this.a = jsrVar;
        this.c = jsrVar2;
        this.b = jucVar;
    }

    public /* synthetic */ kkt(kjj kjjVar, mko mkoVar, kkm kkmVar, String str, int i) {
        this.e = i;
        this.a = kjjVar;
        this.b = mkoVar;
        this.c = kkmVar;
        this.d = str;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.concurrent.Future, java.lang.Object] */
    @Override // defpackage.miy
    public final mko a(Object obj) {
        int i = this.e;
        if (i == 0) {
            Object obj2 = this.a;
            ?? r1 = this.b;
            Object obj3 = this.c;
            Object obj4 = this.d;
            Void r13 = (Void) obj;
            klf klfVar = (klf) kcu.S(r1);
            if (!klfVar.b.isEmpty()) {
                kkm kkmVar = (kkm) obj3;
                kjj kjjVar = (kjj) obj2;
                return mio.h(mkh.q(mio.g(mkh.q(kko.b(kjjVar).a()), new kdw(kkmVar.a, 3), kjjVar.e())), new kkt((String) obj4, kkmVar, kjjVar, klfVar, 2), kjjVar.e());
            }
            return mkk.a;
        } else if (i == 1) {
            Object obj5 = this.d;
            Object obj6 = this.a;
            Object obj7 = this.c;
            Object obj8 = this.b;
            Throwable th = (Throwable) obj;
            jwz jwzVar = (jwz) obj5;
            juq juqVar = jwzVar.c.e;
            try {
                ((jvg) juqVar).b.getWritableDatabase().execSQL("UPDATE file_metadata SET validation_count=validation_count+1 WHERE namespace=? AND name=?", new String[]{((jrh) obj6).a, ((jrh) obj6).b});
                jwzVar.e.a(new jwx(jwzVar, (jsr) obj7, (juc) obj8, (jsr) obj6, th, 1));
                return kcu.J(th);
            } catch (SQLiteException e) {
                jum jumVar = ((jvg) juqVar).b;
                IOException iOException = new IOException("SqliteFileMetadataTable#incrementValidationFailureCount, SQL update failed, name: ".concat(obj6.toString()), e);
                jumVar.a(iOException);
                throw iOException;
            }
        } else {
            Object obj9 = this.d;
            Object obj10 = this.c;
            Object obj11 = this.a;
            Object obj12 = this.b;
            if (!((String) obj).equals(obj9)) {
                return mkk.a;
            }
            if (kku.c.containsKey(lfc.a(((kkm) obj10).a, obj9))) {
                return mkk.a;
            }
            return ((kjj) obj11).c().a(((klf) obj12).b);
        }
    }
}
