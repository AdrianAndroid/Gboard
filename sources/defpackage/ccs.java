package defpackage;

import com.google.android.keyboard.client.delight5.DynamicLm;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* renamed from: ccs  reason: default package */
/* loaded from: classes.dex */
final class ccs extends cav {
    final /* synthetic */ cct a;
    private final List b;

    public ccs(cct cctVar, List list) {
        this.a = cctVar;
        this.b = list;
    }

    @Override // defpackage.cav
    protected final void a(mvm mvmVar, DynamicLm dynamicLm) {
        Iterator it;
        String str;
        dynamicLm.openDynamicLm(mvmVar);
        dynamicLm.clearDynamicLm(mvmVar);
        Iterator it2 = this.b.iterator();
        while (it2.hasNext()) {
            String str2 = (String) it2.next();
            cct cctVar = this.a;
            int seconds = (int) TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
            boolean z = false;
            int codePointCount = Character.codePointCount(str2, 0, str2.length());
            ArrayList arrayList = new ArrayList();
            LinkedList linkedList = new LinkedList();
            int i = 0;
            while (true) {
                if (i >= codePointCount) {
                    it = it2;
                    break;
                }
                if (Character.isLetter(str2.codePointAt(i))) {
                    int i2 = i + 1;
                    while (i2 < codePointCount) {
                        int codePointAt = str2.codePointAt(i2);
                        if (codePointAt != 45 && codePointAt != 39 && !Character.isLetter(codePointAt)) {
                            break;
                        }
                        i2 += Character.charCount(codePointAt);
                    }
                    String substring = str2.substring(i, i2);
                    int i3 = i2 - 1;
                    int length = substring.length();
                    int i4 = z ? 1 : 0;
                    int i5 = z ? 1 : 0;
                    int codePointCount2 = Character.codePointCount(substring, i4, length);
                    if (codePointCount2 > 48 || codePointCount2 < 2) {
                        it = it2;
                        str = str2;
                    } else {
                        nfh t = mur.f.t();
                        if (t.c) {
                            t.cD();
                            t.c = z;
                        }
                        mur murVar = (mur) t.b;
                        substring.getClass();
                        int i6 = murVar.a | 1;
                        murVar.a = i6;
                        murVar.b = substring;
                        murVar.a = i6 | 4;
                        murVar.d = 1;
                        String f = lex.d(" ").f(linkedList);
                        if (t.c) {
                            t.cD();
                            t.c = false;
                        }
                        mur murVar2 = (mur) t.b;
                        int i7 = murVar2.a | 2;
                        murVar2.a = i7;
                        murVar2.c = f;
                        murVar2.a = i7 | 8;
                        it = it2;
                        str = str2;
                        murVar2.e = seconds;
                        arrayList.add((mur) t.cz());
                        if (arrayList.size() >= 10) {
                            break;
                        }
                        linkedList.add(substring);
                        if (linkedList.size() > 2) {
                            linkedList.removeFirst();
                        }
                    }
                    i = i3;
                } else {
                    it = it2;
                    str = str2;
                }
                i++;
                it2 = it;
                str2 = str;
                z = false;
            }
            int size = arrayList.size();
            for (int i8 = 0; i8 < size; i8++) {
                mur murVar3 = (mur) arrayList.get(i8);
                nfh t2 = muk.e.t();
                mvm b = cctVar.b();
                if (t2.c) {
                    t2.cD();
                    t2.c = false;
                }
                muk mukVar = (muk) t2.b;
                b.getClass();
                mukVar.d = b;
                int i9 = mukVar.a | 4;
                mukVar.a = i9;
                murVar3.getClass();
                mukVar.b = murVar3;
                int i10 = i9 | 1;
                mukVar.a = i10;
                int i11 = murVar3.d;
                mukVar.a = i10 | 2;
                mukVar.c = i11;
                dynamicLm.incrementNgramInDynamicLm((muk) t2.cz());
            }
            it2 = it;
        }
        dynamicLm.flushDynamicLm(mvmVar);
        dynamicLm.closeDynamicLm(mvmVar);
    }
}
