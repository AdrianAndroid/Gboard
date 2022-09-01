package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* compiled from: PG */
/* renamed from: eou  reason: default package */
/* loaded from: classes.dex */
public final class eou extends Enum implements ids {
    public static final eou a;
    private static final /* synthetic */ eou[] b;
    private final String c = "SplitPrompt.Tooltip.displayDuration";

    static {
        eou eouVar = new eou();
        a = eouVar;
        b = new eou[]{eouVar};
    }

    private eou() {
    }

    public static eou[] values() {
        return (eou[]) b.clone();
    }

    @Override // defpackage.idt
    public final /* synthetic */ int a() {
        return -1;
    }

    @Override // defpackage.idt
    public final String b() {
        return this.c;
    }
}
