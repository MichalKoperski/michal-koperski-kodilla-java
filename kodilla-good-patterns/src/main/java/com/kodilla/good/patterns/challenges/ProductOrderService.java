package com.kodilla.good.patterns.challenges;

public class ProductOrderService {
    private InformationSender informationSender;
    private PurchaseService purchaseService;
    private PurchaseRepository purchaseRepository;

    public ProductOrderService(final InformationSender informationSender,
                           final PurchaseService purchaseService,
                           final PurchaseRepository purchaseRepository) {
        this.informationSender = informationSender;
        this.purchaseService = purchaseService;
        this.purchaseRepository = purchaseRepository;
    }

    public PurchaseDto process(final PurchaseRequest purchaseRequest) {
        boolean isPurchased = purchaseService.purchase(purchaseRequest.getUser(), purchaseRequest.getProduct());

        if(isPurchased) {
            informationSender.inform(purchaseRequest.getUser());
            purchaseRepository.createPurchase(purchaseRequest.getUser(), purchaseRequest.getProduct());
            return new PurchaseDto(purchaseRequest.getUser(), true);
        } else {
            return new PurchaseDto(purchaseRequest.getUser(), false);
        }
    }
}
