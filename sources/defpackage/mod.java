package defpackage;

import android.content.Context;
import com.google.firebase.dynamiclinks.internal.FirebaseDynamicLinkRegistrar;
import java.util.Set;

/* compiled from: PG */
/* renamed from: mod  reason: default package */
/* loaded from: classes2.dex */
public final /* synthetic */ class mod implements mmt {
    private final /* synthetic */ int d;
    public static final /* synthetic */ mod c = new mod(2);
    public static final /* synthetic */ mod b = new mod(1);
    public static final /* synthetic */ mod a = new mod(0);

    private /* synthetic */ mod(int i) {
        this.d = i;
    }

    @Override // defpackage.mmt
    public final Object a(mms mmsVar) {
        int i = this.d;
        if (i != 0) {
            if (i == 1) {
                return FirebaseDynamicLinkRegistrar.lambda$getComponents$0(mmsVar);
            }
            Set b2 = mmsVar.b(mol.class);
            mok mokVar = mok.a;
            if (mokVar == null) {
                synchronized (mok.class) {
                    mokVar = mok.a;
                    if (mokVar == null) {
                        mokVar = new mok();
                        mok.a = mokVar;
                    }
                }
            }
            return new moj(b2, mokVar);
        }
        return new moe((Context) mmsVar.a(Context.class), ((mmk) mmsVar.a(mmk.class)).d(), mmsVar.b(mof.class), mmsVar.c(moo.class));
    }
}
