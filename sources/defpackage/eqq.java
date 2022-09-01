package defpackage;

import android.content.res.ColorStateList;
import android.graphics.Color;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* renamed from: eqq  reason: default package */
/* loaded from: classes.dex */
public final class eqq {
    private static final ColorStateList b = ColorStateList.valueOf(-16777216);
    public final List a;

    public eqq(List list) {
        this.a = list;
    }

    public static ColorStateList a(eqq eqqVar, eqq eqqVar2) {
        if (eqqVar == null) {
            eqqVar = new eqq(Collections.singletonList(ewj.e(era.j(-16777216), new int[0])));
        }
        if (eqqVar2 == null) {
            return b(eqqVar);
        }
        ArrayList arrayList = new ArrayList();
        for (ewj ewjVar : eqqVar.a) {
            for (ewj ewjVar2 : eqqVar2.a) {
                int round = (Math.round(Color.alpha(((eut) ewjVar.a).b) * ((float) ((eut) ewjVar2.a).i)) << 24) | (((eut) ewjVar.a).b & 16777215);
                int[][] iArr = {(int[]) ewjVar.b, (int[]) ewjVar2.b};
                int i = 0;
                for (int i2 = 0; i2 < 2; i2++) {
                    i += iArr[i2].length;
                }
                int[] iArr2 = new int[i];
                int i3 = 0;
                for (int i4 = 0; i4 < 2; i4++) {
                    int[] iArr3 = iArr[i4];
                    int length = iArr3.length;
                    System.arraycopy(iArr3, 0, iArr2, i3, length);
                    i3 += length;
                }
                arrayList.add(ewj.e(era.j(round), iArr2));
            }
        }
        return b(new eqq(arrayList));
    }

    public static ColorStateList b(eqq eqqVar) {
        return c(eqqVar, b);
    }

    public static ColorStateList c(eqq eqqVar, ColorStateList colorStateList) {
        if (eqqVar == null) {
            return colorStateList;
        }
        List list = eqqVar.a;
        int[][] iArr = new int[list.size()];
        int[] iArr2 = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            ewj ewjVar = (ewj) list.get(i);
            iArr[i] = (int[]) ewjVar.b;
            iArr2[i] = ((eut) ewjVar.a).b;
        }
        return new ColorStateList(iArr, iArr2);
    }
}
