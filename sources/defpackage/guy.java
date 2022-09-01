package defpackage;

/* compiled from: PG */
/* renamed from: guy  reason: default package */
/* loaded from: classes.dex */
public enum guy implements ids {
    APP_CREATE_INITIALLY_UNLOCKED("App.createUnlock-time"),
    APP_CREATE_INITIALLY_LOCKED("App.createLocked-time"),
    APP_PERFORM_USER_UNLOCK_INITIALLY_UNLOCKED("App.performUnlockUserInitiallyUnlocked-time"),
    APP_PERFORM_USER_UNLOCK_INITIALLY_LOCKED("App.performUnlockUserInitiallyLocked-time");
    
    private final String f;
    private final int g = -1;

    guy(String str) {
        this.f = str;
    }

    @Override // defpackage.idt
    public final int a() {
        return this.g;
    }

    @Override // defpackage.idt
    public final String b() {
        return this.f;
    }
}
