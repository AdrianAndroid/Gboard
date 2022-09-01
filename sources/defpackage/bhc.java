package defpackage;

import android.content.ContentResolver;
import android.graphics.Typeface;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* compiled from: PG */
/* renamed from: bhc  reason: default package */
/* loaded from: classes.dex */
public final class bhc {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;

    public bhc(apd apdVar, apd apdVar2, ape apeVar, ape apeVar2) {
        this.c = apdVar;
        this.d = apdVar2;
        this.b = apeVar;
        this.a = apeVar2;
    }

    public bhc(bho bhoVar, bho bhoVar2, bho bhoVar3, bho bhoVar4) {
        this.a = bhoVar;
        this.b = bhoVar2;
        this.c = bhoVar3;
        this.d = bhoVar4;
    }

    public bhc(List list, awc awcVar, axn axnVar, ContentResolver contentResolver) {
        this.d = awcVar;
        this.b = axnVar;
        this.c = contentResolver;
        this.a = list;
    }

    public bhc(byte[] bArr) {
        this.b = new xy(10);
        this.a = new qv();
        this.d = new ArrayList();
        this.c = new HashSet();
    }

    public final ArrayList a(Object obj) {
        return (ArrayList) ((qv) this.a).get(obj);
    }

    public final void b(Object obj) {
        if (!((qv) this.a).containsKey(obj)) {
            ((qv) this.a).put(obj, null);
        }
    }

    public final void c(Object obj, ArrayList arrayList, HashSet hashSet) {
        if (arrayList.contains(obj)) {
            return;
        }
        if (hashSet.contains(obj)) {
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
        hashSet.add(obj);
        ArrayList arrayList2 = (ArrayList) ((qv) this.a).get(obj);
        if (arrayList2 != null) {
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                c(arrayList2.get(i), arrayList, hashSet);
            }
        }
        hashSet.remove(obj);
        arrayList.add(obj);
    }

    bhc() {
        this.a = null;
        this.d = null;
        this.b = new adx(1024);
        this.c = new char[0];
    }

    public bhc(Typeface typeface, ajj ajjVar) {
        this.a = typeface;
        this.d = ajjVar;
        this.b = new adx(1024);
        int e = ajjVar.e();
        this.c = new char[e + e];
        int e2 = ajjVar.e();
        for (int i = 0; i < e2; i++) {
            adr adrVar = new adr(this, i, null, null);
            Character.toChars(adrVar.c(), (char[]) this.c, i + i);
            nq.c(adrVar.b() > 0, "invalid metadata codepoint length");
            ((adx) this.b).b(adrVar, 0, adrVar.b() - 1);
        }
    }
}
